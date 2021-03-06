import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
import time
import requests
import sklearn as sk
import urllib


#Task DataCollection
start_time = time.time()
data_frames = []
''' 
r= requests.get('www.amazon.it/user'+query_str)
print("Downloading from source1, of type IoT")
'''
filename_source1 = 'DataCollection_source1.json'
''' 
open(filename_source1,'w').write(r.content) 
'''
data_source1 = pd.read_json(filename_source1, orient="records")
data_frames.append(data_source1)
df = data_frames[0]
end_time = time.time() 
print('DataCollection',start_time, end_time)

#Task DBSCAN
start_time = time.time()
from sklearn.cluster import DBSCAN

dbscan = DBSCAN(eps=2, min_samples=2).fit(df.values)
df['cluster'] = dbscan.labels_
end_time = time.time() 
print('DBSCAN',start_time, end_time)

#Task export
start_time = time.time()
df.to_json('out1.json',orient="records")

end_time = time.time() 
print('export',start_time, end_time)