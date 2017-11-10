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
：wq 保存退出
：q! 强制退出并忽略所有更改
: e! 放弃所有操作并打开原来文件
