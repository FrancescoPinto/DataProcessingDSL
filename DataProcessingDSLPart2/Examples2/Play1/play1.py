import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import time
import requests
import sklearn as sk
import urllib


#Task dataCollection
start_time = time.time()
data_frames = []
''' 
r= requests.get('invalid'+query_str)
print("Downloading from 1, of type IoT")
'''
filename_1 = 'dataCollection_1.json'
''' 
open(filename_1,'w').write(r.content) 
'''
data_1 = pd.read_json(filename_1, orient="records")
data_frames.append(data_1)
''' 
r= requests.get('invalid'+query_str)
print("Downloading from 2, of type IoT")
'''
filename_2 = 'dataCollection_2.csv'
''' 
open(filename_2,'w').write(r.content) 
'''
data_2 = pd.read_csv(filename_2)
data_frames.append(data_2)

end_time = time.time() 
print('dataCollection',start_time, end_time)


#Task join
start_time = time.time()
join_attributes = []
join_attributes.append('att1')
join_attributes.append('att2')
temp = data_frames[0]
for i in range(0,len(data_frames)-1):
	temp = temp.merge(data_frames[i+1],left_on=join_attributes[i], right_on = join_attributes[i+1])
join_attributes.pop(0)
drop_attributes = join_attributes
df = temp.drop(columns=drop_attributes)

end_time = time.time() 
print('join',start_time, end_time)

#Task nullRemove
start_time = time.time()
df = df.dropna()

end_time = time.time() 
print('nullRemove',start_time, end_time)

#Task linRegr
start_time = time.time()
linear_regression_coefficients_linRegr = np.array([12, -2])

prediction = []
for index, row in df.iterrows():
	prediction.append(np.dot(linear_regression_coefficients_linRegr[1:len(linear_regression_coefficients_linRegr)].T, row.values)+linear_regression_coefficients_linRegr[0])

df['prediction'] = prediction
end_time = time.time() 
print('linRegr',start_time, end_time)

#Task logRegr
start_time = time.time()
log_regression_coefficients_logRegr = np.array([2, -4, 0.21])

prediction = []
for index, row in df.iterrows():
	prediction.append(1./(1+np.exp(np.dot(log_regression_coefficients_logRegr[1:len(log_regression_coefficients_logRegr)].T, row.values)+log_regression_coefficients_logRegr[0])))
df['prob'] = prediction
end_time = time.time() 
print('logRegr',start_time, end_time)

#Task labelScatter
start_time = time.time()
Xnames = ['att1','prediction']
Yname = 'prob'
annotateAttribute = 'prob'
fig, axes = plt.subplots(ncols = len(Xnames))
for i in range(0, len(Xnames)):
	Xname = Xnames[i]
	axes[i].scatter(df[Xname].values,df[Yname].values)
	axes[i].set_xlabel(Xname)
	axes[i].set_ylabel(Yname)
	for h,val in enumerate(df[annotateAttribute].values):
		axes[i].annotate(val,(df[Xname].values[h],df[Yname].values[h]))

plt.show()
end_time = time.time() 
print('labelScatter',start_time, end_time)

#Task pie
start_time = time.time()
fig, axes = plt.subplots(ncols = len(df.columns))
for i in range(0,len(axes)):
    colName = df.columns.values.tolist()[i]
    axes[i].pie(df[colName].value_counts(ascending=True), labels = df[colName].value_counts(ascending=True).index)
    axes[i].set_title(colName)
    print("Printing axis {ind} named {name}".format(ind=i, name=colName))
    plt.tight_layout()  # automatically adjust subplot parameters to give specified padding
plt.show()
end_time = time.time() 
print('pie',start_time, end_time)

#Task scatter
start_time = time.time()
Xnames = ['prediction']
Yname = 'prob'
fig, axes = plt.subplots(ncols = len(Xnames))
for i in range(0, len(Xnames)):
	Xname = Xnames[i]
	axes.scatter(df[Xname].values,df[Yname].values)
	axes.set_xlabel(Xname)
	axes.set_ylabel(Yname)

plt.show()
end_time = time.time() 
print('scatter',start_time, end_time)

#Task customCleaning
start_time = time.time()

from dropOutliers import dropOutliers

#parameter values 
df = dropOutliers(df,)
end_time = time.time() 
print('customCleaning',start_time, end_time)

#Task select
start_time = time.time()
df = df[['prediction']]
end_time = time.time() 
print('select',start_time, end_time)

#Task kmeans
start_time = time.time()
from sklearn.cluster import KMeans

kmeans = KMeans(n_clusters = 2, random_state = 0).fit(df.values)
df['Cluster'] = kmeans.labels_
end_time = time.time() 
print('kmeans',start_time, end_time)

#Task export
start_time = time.time()
df.to_json('out1.json',orient="records")

end_time = time.time() 
print('export',start_time, end_time)