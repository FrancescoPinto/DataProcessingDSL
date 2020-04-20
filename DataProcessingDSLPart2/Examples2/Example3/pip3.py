import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import time
import requests
import sklearn as sk
import urllib


#Task datacollection
start_time = time.time()
data_frames = []
''' 
r= requests.get('www.amazon.it/income'+query_str)
print("Downloading from in1, of type IoT")
'''
filename_in1 = 'datacollection_in1.json'
''' 
open(filename_in1,'w').write(r.content) 
'''
data_in1 = pd.read_json(filename_in1, orient="records")
data_frames.append(data_in1)
df = data_frames[0]
end_time = time.time() 
print('datacollection',start_time, end_time)

#Task kmeans
start_time = time.time()
from sklearn.cluster import KMeans

kmeans = KMeans(n_clusters = 2, random_state = 0).fit(df.values)
df['cluster'] = kmeans.labels_
end_time = time.time() 
print('kmeans',start_time, end_time)

#Task lasso
start_time = time.time()
lasso_regression_coefficients_lasso = np.array([12, 22, 12])

prediction = []
for index, row in df.iterrows():
	prediction.append(np.dot(lasso_regression_coefficients_lasso[1:len(lasso_regression_coefficients_lasso)].T, row.values)+lasso_regression_coefficients_lasso[0])

df['prediction'] = prediction
end_time = time.time() 
print('lasso',start_time, end_time)

#Task proj
start_time = time.time()
df = df[['prediction']]
end_time = time.time() 
print('proj',start_time, end_time)

#Task exp
start_time = time.time()
df.to_json('out.json',orient="records")

end_time = time.time() 
print('exp',start_time, end_time)