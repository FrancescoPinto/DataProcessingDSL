import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import time
import requests
import sklearn as sk
import urllib


#Task dc1
start_time = time.time()
data_frames = []
''' 
query = {'query':'and(age=32, not(likes<4000))'}
query_str = urllib.urlencode(query)r= requests.get('www.facebook.com/user?query='+query_str)
print("Downloading from sour1, of type SocialMedia")
'''
filename_sour1 = 'dc1_sour1.json'
''' 
open(filename_sour1,'w').write(r.content) 
'''
data_sour1 = pd.read_json(filename_sour1, orient="records")
data_frames.append(data_sour1)
''' 
query = {'query':'age=32'}
query_str = urllib.urlencode(query)r= requests.get('www.amazon.com/user?query='+query_str)
print("Downloading from sour2, of type Web")
'''
filename_sour2 = 'dc1_sour2.json'
''' 
open(filename_sour2,'w').write(r.content) 
'''
data_sour2 = pd.read_json(filename_sour2, orient="records")
data_frames.append(data_sour2)

end_time = time.time() 
print('dc1',start_time, end_time)

#Task di1
start_time = time.time()
temp = data_frames[0]
for i in range(0,len(data_frames)-1):
	temp = temp.merge(data_frames[i+1],left_index=True, right_index = True)

df = temp

end_time = time.time() 
print('di1',start_time, end_time)

#Task svm
start_time = time.time()
support_vectors = []
support_vectors.append(np.array([2, 4]))
support_vectors.append(np.array([1, 0]))
svm_coefficients_svm = np.array([12, 31, -23])

prediction = []
for index, row in df.iterrows():
    lin_comb = svm_coefficients_svm[0]
    for i in range(0,len(support_vectors)):
        lin_comb += svm_coefficients_svm[i+1]*(1+np.dot(support_vectors[i].T,row.values))^3
        
    prediction.append(np.sign(lin_comb))

df['att3'] = prediction
end_time = time.time() 
print('svm',start_time, end_time)

#Task export
start_time = time.time()
df.to_json('out.json',orient="records")

end_time = time.time() 
print('export',start_time, end_time)