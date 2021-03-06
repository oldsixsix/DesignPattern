# 进程与线程
## 进程
- 程序由指令和数据组成，但是这些指令要运行，数据要读写就必须将指令加载至CPU，
数据加载至内存。在指令运行过程中还需要用到磁盘、网络等设备
- 进程就是用来加载指令、管理内存、管理IO的
- 当一个程序被运行，从磁盘加载这个程序的代码至内存中，这时就开启了一个进程
- 进程可以看做是程序的一个实例，大部分程序可以同时运行多个实例进程（例如记事本，画图，浏览器等）
- 某些程序就只能启动一个实例进程 360 qq音乐等

## 线程
- 一个进程之内可以分为一到多个线程
- 一个线程就是一个指令流，将指令流中的一条条指令以一定顺序交给CPU执行
- Java中，线程作为最小调度单位，进程作为资源分配的最小单位，在windows中进程是不活动的，只是作为线程的容器

## 二者对比
- 进程基本上是相互独立的，线程存于进程内，是进程的一个子集
- 统一进程中的线程共享其内部的资源
- 进程通信较为复杂
    1. 同一台计算机的进程通信称为IPC
    2. 不同计算机之间的进程通信，需要通过网络，并遵守共同的协议，例如HTTP
- 线程通信相对简单，因为他们共享进程内的内存，一个例子多个线程可以访问同一个共享变量
- 线程更加轻量，线程上下文切换成本一般上要比进程上下文切换低

# 并行并发概念
单核CPU下，线程实际还是串行执行的，操作系统中有一个组件叫做任务调度器，将CPU的时间片（windows下时间片最小约为15ms）
只是CPU在线程间的切换非常快，人类感觉是同时运行的，每个线程都在执行，但实际上是cpu分时间片轮流执行
即 微观串行--宏观并行

## 并发
- 并发强调的是时间片的轮换，交替执行。然而在时间片轮换过程中对于使用程序的用户来说错觉上就感觉是同时运行的
- 宏观上同时运行，实际上串行，并发本质是串行cpu的时间片轮转。
- 同一时间应对多件事情的能力，轮流去做
## 并行
- 实际上如果是单核CPU的话，并做不到真正的并行。因为只有一个处理器，只能靠CPU的时间片的切换来并发执行，以给用户一种真正意义上的并行。
- 多核CPU的情况下可以做到并行，cpu1执行线程1--cpu2执行线程2做到真正的同时运行。
- 同一时间动手做多件事情的能力，左手画圆右手换正方形，同时做

# 应用
## 方法调用角度
- 需要等待结果返回才能继续的就是同步调用
- 不需要等待结果返回，就能运行的是异步调用
- 注：同步在多线程中还有另外一个意思，就是让多个线程步调一致
## 设计
- 多线程可以让方法的执行变为异步的，即不用一直等待着方法的返回，
比如说读取磁盘文件时，假设读取操作花费了5s如果没有现成调度机制这5s中调用者什么都做不了，只能等待
- 例如在项目中，视频文件需要转换格式等操作比较费时，这时开一个新现成处理视频转换，避免阻塞主线程

# Java线程学习
## 创建线程的方式
1. 直接使用Thread方式创建
2. 使用Runnable将进程与要执行的任务分离，Runnable中存放要执行的任务
3. 使用FutureTask配合Runnable，FutureTask能够接收Callable类型的参数，用来处理有返回结果的情况

## 查看进程线程的方法


