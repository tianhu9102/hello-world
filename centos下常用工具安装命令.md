一、git
卸载方法： yum remove git
安装方法：
1.下载编译工具
yum groupinstall "Development Tools"

2.下载依赖安装包
yum install zlib-devel perl-ExtUtils-MakeMaker asciidoc xmlto openssl-devel

3.下载 git 最新版本源代码
wget http://github.com/git/git/archive/v2.9.2.tar.gz

4.解压进入目录
 tar -zxvf v2.9.2.tar.gz 
 cd git-2.9.2/

 5.编译安装
 make configure
 ./configure --prefix=/usr/local/git --with-iconv=/usr/local/libiconv
make all doc
make install install-doc install-html

6.修改环境变量
sudo vim /etc/profile
在最后一行添加， export PATH=/usr/local/git/bin:$PATH
source /etc/profile

7.查看版本
git --version

二、vim
有两种模式：操作模式（默认）和编辑模式
进入编辑模式： A O I
回退到操作模式： ESC
：wq 保存退出
：q  退出并忽略所有更改
: e! 放弃所有操作并打开原来文件

三、scp命令
从本地上传到远程服务器
scp local_file remote_username@remote_ip:remote_folder
scp -r test  hadoop@slave1:/home/hadoop/Downloads 
从远程复制到本地服务器
scp -r hadoop@master:/home/hadoop/1116/models  test

四、ip修改
（1）修改IP
cd  /etc/sysconfig/network-scripts/ 
vim ifcfg-enp4s0

（2）修改网关地址

（3）修改DNS
vim /etc/resolv.conf



service network restart

五
rm video1.mp4   删除文件
rm -rf video_dir 删除文件夹

mv video_1.mp4 video1.mp4 重命名文件
mv test1 test2重命名文件夹




