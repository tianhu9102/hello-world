参考：对于谷歌开源的TensorFlow Object Detection API视频物体识别系统实现教程
      http://m.blog.csdn.net/xiaoxiao123jun/article/details/76605928

1、需要环境：
关键是protobuf，而安装protobuf前需要m4、autoconf、automake、libtool、curl等
1.1 m4、autoconf、automake、libtool下载
wget http://ftp.gnu.org/gnu/m4/m4-1.4.17.tar.gz
wget http://ftp.gnu.org/gnu/autoconf/autoconf-2.69.tar.gz
wget http://ftp.gnu.org/gnu/automake/automake-1.12.2.tar.gz
wget http://ftp.gnu.org/gnu/libtool/libtool-2.4.6.tar.gz
wget http://curl.haxx.se/download/curl-7.38.0.tar.gz

安装步骤如下：
对上述文件分别解压，进入解压目录
./configure
make 
make install

验证安装成功
m4 --version  
libtool --version    
automake --version  
autoconf --version  
curl --version

1.2 其他依赖，避免下一步出错
yum install yum-fastestmirror
yum install gcc
yum install glibc-headers gcc-c++

1.3 protobuf
网址 https://github.com/google/protobuf/releases
下载版本 protobuf-3.4.0的源码 Source code (tar.gz)
解压 tar -zxvf protobuf-3.4.0.tar.gz -C /usr/local/
cd protobuf-3.4.0/
./autogen.sh
./configure --prefix=/usr/local/protobuf

make
make check
make install
ldconfig

1.4运行图像、视频物体识别API需要满足下面三个条件
（1）确保tensorflow版本为1.4

（2）安装opencv-python
下载: https://pypi.python.org/pypi/opencv-python
版本：opencv_python-3.3.0.10-cp27-cp27mu-manylinux1_x86_64.whl

（3）安装截取视频的库
pip install moviepy

1.5项目源码 
图像物体识别  git clone https://github.com/tensorflow/models.git  
视频物体识别  git clone https://github.com/priya-dwivedi/Deep-Learning.git

1.6 图像物体识别API运行过程：
cd models/research/
protoc object_detection/protos/*.proto --python_out=.
jupyter-notebook
进入 object_detection文件夹下的object_detection_tutorial.ipynb

修改模型名称为： ssd_mobilenet_v1_coco_11_06_2017
# What model to download.  
#MODEL_NAME = 'ssd_mobilenet_v1_coco_2017_11_08'
MODEL_NAME = 'ssd_mobilenet_v1_coco_11_06_2017'

点击Cell目录下的Run All，等待3分钟出结果（同时显示原始图像+识别框+label，即为成功）


1.7 视频物体识别API运行过程：
进入上述models文件夹下面 models/research/
将整个object_detection文件夹拷贝、粘贴到Deep-Learning文件夹下，
注意修改模型名称，与object_detection下面的模型名称一致，如：ssd_mobilenet_v1_coco_11_06_2017

同时在Deep-Learning文件夹下拷贝输入的视频文件video1.mp4、cars.mp4、fruits1.mp4、dog.mp4等测试视频
测试时根据实际情况调整截取视频时间范围，本测试使用的几个视频都为（0,2）
建议修改为（5,8）（9,13)，（0,2），（0,2）

运行jupyter-notebook

输出结果为4个对应的输出视频+ 1个拼接视频及其对应的gif图





