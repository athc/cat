# git 

## 关于GIT

GIT是一个分布式版本控制系统；什么是“版本控制”？版本控制是一种记录一个或若干文件内容变化，以便将来查阅特定版本修订情况的系统。

## 版本控制演变过程

![image-20210302171431082](https://i.loli.net/2021/03/05/CI6xGVmyKeNbXnu.png)

### 本地版本控制

![image-20210302174710428](https://i.loli.net/2021/03/05/OBZAwbtcPD7KNsI.png)

本地保存不同的版本，最流行的方式是RCS（一种用软件实现自动存储、检索、日志记录、识别、和合并修订的系统）

* 优点： 简单
* 缺点：出错率高

### 中心化版本控制

![image-20210302174746622](https://i.loli.net/2021/03/05/mGSev28yFxhzlaJ.png)

通过中央服务器，保存所有文件的修改版本，协同工作的用户通过客户端连接中央服务器，拉取最新的文件或者提交更新。代表系统有Subversion 

* 优点：用户可以协同工作、管理员吧方便管理用户进度
* 缺点：中央服务器故障数据损坏恢复困难

### 分布式版本控制

![image-20210302174823808](https://i.loli.net/2021/03/05/Evufyo4YktbWXL2.png)

客户端把代码仓库完整地镜像下来，包括完整的历史记录，操作完全本地。代表系统有git

* 优点：可以离线本地操作速度快，切换灵活；服务器故障可以通过任何一个本地镜像恢复数据包括提交记录；
* 缺点：工作目录只能是整个目录，不支持单个目录；权限控制一般通过文件读写权限实现；



## git安装和配置

### git安装



### git配置

Git 自带一个 `git config` 的工具来帮助设置控制 Git 外观和行为的配置变量。

配置优先级：

**项目内config**（local） > **系统用户config**(global) > **git自带config**(system)

通过命令` git config --list --show-origin`可以查看配置及配置来源

![image-20210302180659824](https://i.loli.net/2021/03/05/wIQDnfregOuT4Sh.png)

常用配置命令如下，设置您的用户名和电子邮件地址，用于每次提交

```shell
 git config --global user.name "张三"
 git config --global user.email zs@abc.com
```

#### ssh公钥配置

```shell
cd ~/.ssh
# ssh-keygen -t rsa -C 'email@abc.com'
cat ~/.ssh/id_rsa.pub
# 添加公钥
```



## git工作流程

### 本地开发的工作流程

![image-20210303153405177](https://i.loli.net/2021/03/05/yWa6dse9q3jVbUE.png)



#### 基本概念

* HEAD

  `HEAD` 是当前分支引用的指针，它总是指向该分支上的最后一次提交。 这表示 `HEAD` 将是下一次提交的父结点。 通常，可以把 `HEAD` 看做你的上一次提交的快照。***可以简单理解为： HEAD 指向分支（branch），分支指向提交***

* Index

  Index（索引，或暂存区）是你预期的下一次提交

* Workplace

  

### 多人协作的工作流程

![image-20210305100624996](https://i.loli.net/2021/03/05/ZFpxTezKcVaIdQS.png)



## git传输协议

### 本地协议



### http协议

* #### 智能 HTTP 协议

* #### 哑（Dumb） HTTP 协议

### ssh协议




## git命令

git help

### 基础命令

#### 创建项目

git init 

git clone 

git status

git diff

git notes

git reset



#### 快照操作

git add

git commit



### 分支管理命令

Git 的分支其实本质上仅仅是指向提交对象的可变指针

![image-20210305095342519](https://i.loli.net/2021/03/05/sXG7pMEIoPy1e5D.png)

git branch testing

git fetch 

git merge 

git rebase

git tag



### 删除分支

git branch -d 

git branch -d origin 

git push origin -d 



