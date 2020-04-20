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
r= requests.get('invalid'+query_str)
print("Downloading from i1, of type SocialMedia")
'''
filename_i1 = 'dc1_i1.json'
''' 
open(filename_i1,'w').write(r.content) 
'''
data_i1 = pd.read_json(filename_i1, orient="records")
data_frames.append(data_i1)
''' 
r= requests.get('invalid'+query_str)
print("Downloading from i2, of type SocialMedia")
'''
filename_i2 = 'dc1_i2.json'
''' 
open(filename_i2,'w').write(r.content) 
'''
data_i2 = pd.read_json(filename_i2, orient="records")
data_frames.append(data_i2)
''' 
r= requests.get('invalid'+query_str)
print("Downloading from i3, of type SocialMedia")
'''
filename_i3 = 'dc1_i3.json'
''' 
open(filename_i3,'w').write(r.content) 
'''
data_i3 = pd.read_json(filename_i3, orient="records")
data_frames.append(data_i3)

end_time = time.time() 
print('dc1',start_time, end_time)

#Task dataIntegration
start_time = time.time()
join_attributes = []
join_attributes.append('att1')
join_attributes.append('att4')
join_attributes.append('att5')
temp = data_frames[0]
for i in range(0,len(data_frames)-1):
	temp = temp.merge(data_frames[i+1],left_on=join_attributes[i], right_on = join_attributes[i+1])
join_attributes.pop(0)
drop_attributes = join_attributes
df = temp.drop(columns=drop_attributes)

end_time = time.time() 
print('dataIntegration',start_time, end_time)

#Task customCleaning
start_time = time.time()

from performMyCleaning import performMyCleaning

#parameter values 
param1 = 'HelloWorld'
df = performMyCleaning(df,param1)
end_time = time.time() 
print('customCleaning',start_time, end_time)

#Task nullRemoval
start_time = time.time()
df = df.fillna(df.mean())

end_time = time.time() 
print('nullRemoval',start_time, end_time)

#Task selectAttributes
start_time = time.time()
df = df[['att1','att3','att6']]
end_time = time.time() 
print('selectAttributes',start_time, end_time)

#Task scatterplot
start_time = time.time()
Xnames = ['att1']
Yname = 'att6'
fig, axes = plt.subplots(ncols = len(Xnames))
for i in range(0, len(Xnames)):
	Xname = Xnames[i]
	axes.scatter(df[Xname].values,df[Yname].values)
	axes.set_xlabel(Xname)
	axes.set_ylabel(Yname)

plt.show()
end_time = time.time() 
print('scatterplot',start_time, end_time)

#Task export
start_time = time.time()
fig.savefig('out')

end_time = time.time() 
print('export',start_time, end_time)