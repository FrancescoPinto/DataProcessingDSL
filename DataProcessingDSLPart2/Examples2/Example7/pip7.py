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
query = {'query':'param4contains Dada'}
query_str = urllib.urlencode(query)r= requests.get('www.sr2.it/table?query='+query_str)
print("Downloading from src2, of type SocialMedia")
'''
filename_src2 = 'datacollection_src2.html'
''' 
open(filename_src2,'w').write(r.content) 
'''
data_src2 = pd.read_html(filename_src2,header = 0)[0]
data_frames.append(data_src2)
''' 
query = {'query':'and(or(param2<=32, param3>=78884), param1<30)'}
query_str = urllib.urlencode(query)r= requests.get('www.sr3.com/scores?query='+query_str)
print("Downloading from src3, of type Web")
'''
filename_src3 = 'datacollection_src3.csv'
''' 
open(filename_src3,'w').write(r.content) 
'''
data_src3 = pd.read_csv(filename_src3)
data_frames.append(data_src3)
''' 
r= requests.get('www.sr1.com/data1'+query_str)
print("Downloading from src1, of type IoT")
'''
filename_src1 = 'datacollection_src1.xlsx'
''' 
open(filename_src1,'w').write(r.content) 
'''
data_src1 = pd.read_excel(filename_src1)
data_frames.append(data_src1)

end_time = time.time() 
print('datacollection',start_time, end_time)


#Task join
start_time = time.time()
temp = data_frames[0]
for i in range(0,len(data_frames)-1):
	temp = temp.merge(data_frames[i+1],left_index=True, right_index = True)

df = temp

end_time = time.time() 
print('join',start_time, end_time)

#Task medianImputation
start_time = time.time()
df = df.fillna(df.median())

end_time = time.time() 
print('medianImputation',start_time, end_time)

#Task linRegr
start_time = time.time()
linear_regression_coefficients_linRegr = np.array([0.2, 0.84, 1.23, -0.86, -0.78, -1.234, 2])

prediction = []
for index, row in df.iterrows():
	prediction.append(np.dot(linear_regression_coefficients_linRegr[1:len(linear_regression_coefficients_linRegr)].T, row.values)+linear_regression_coefficients_linRegr[0])

df['prediction'] = prediction
end_time = time.time() 
print('linRegr',start_time, end_time)

#Task select
start_time = time.time()
df = df[['att3','prediction']]
end_time = time.time() 
print('select',start_time, end_time)

#Task aggClustering
start_time = time.time()
from sklearn.cluster import AgglomerativeClustering

agg = AgglomerativeClustering(n_clusters = 3, affinity = "euclidean",linkage = "average").fit(df.values)
df['cluster'] = agg.labels_
end_time = time.time() 
print('aggClustering',start_time, end_time)

#Task labeledScatterPlot
start_time = time.time()
Xnames = ['att3']
Yname = 'cluster'
annotateAttribute = 'cluster'
fig, axes = plt.subplots(ncols = len(Xnames))
for i in range(0, len(Xnames)):
	Xname = Xnames[i]
	axes.scatter(df[Xname].values,df[Yname].values)
	axes.set_xlabel(Xname)
	axes.set_ylabel(Yname)
	for h,val in enumerate(df[annotateAttribute].values):
		axes.annotate(val,(df[Xname].values[h],df[Yname].values[h]))

plt.show()
end_time = time.time() 
print('labeledScatterPlot',start_time, end_time)

#Task histogram
start_time = time.time()
fig, axes = plt.subplots(ncols = len(df.columns))
for i in range(0,len(axes)):
    colName = df.columns.values.tolist()[i]
    axes[i].bar(df[colName].value_counts(ascending=True).index,df[colName].value_counts(ascending=True),align='center', alpha=0.4, color='y')
    axes[i].set_title(colName)
    print("Printing axis {ind} named {name}".format(ind=i, name=colName))
    plt.tight_layout()  # automatically adjust subplot parameters to give specified padding
plt.show()
end_time = time.time() 
print('histogram',start_time, end_time)

#Task pieplot
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
print('pieplot',start_time, end_time)

#Task std
start_time = time.time()
df = df.std(axis = 0).to_frame().transpose()
end_time = time.time() 
print('std',start_time, end_time)

#Task export
start_time = time.time()
df.to_html('out1.html')
df.to_csv('out2.csv',index=False)
writer = pd.ExcelWriter('out3.xlsx')
df.to_excel(writer, 'Sheet1')
writer.save()

end_time = time.time() 
print('export',start_time, end_time)