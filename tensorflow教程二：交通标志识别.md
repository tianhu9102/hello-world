使用TensorFlow识别交通标志
http://www.jianshu.com/p/3c7f329b29ee

1.Intel MKL FATAL ERROR: Cannot load libmkl_avx2.so or libmkl_def.so问题解决

conda install nomkl numpy scipy scikit-learn numexpr
conda remove mkl mkl-service

2.下载源码和数据集
源码；git clone https://github.com/waleedka/traffic-signs-tensorflow.git
数据集 http://btsd.ethz.ch/shareddata/  
下载
BelgiumTS for Classification (cropped images):	BelgiumTSC_Training (171.3MBytes)	BelgiumTSC_Testing (76.5MBytes)
 将下载的数据集放在
  traffic-signs-tensorflow/datasets/BelgiumTS/Testing
  traffic-signs-tensorflow/datasets/BelgiumTS/Training
  
3.执行
jupyter-notebook