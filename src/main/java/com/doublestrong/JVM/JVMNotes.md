#StringTable
## demo4测试--jdk1.8 字符串常量池在堆内存中
- 不断添加String字符串到常量池中，并且还存在其引用，垃圾回收没办法回收，
- 这时候堆内存溢出即证明，字符串常量池在堆内存中
- java.lang.OutOfMemoryError: GC overhead limit exceeded 超过GC的开销限制
- jvm垃圾回收机制
    1. 如果98%的时间花在垃圾回收上，但是2%的堆空间被回收了，就会爆出超过GC的开销限制 GC overhead limit exceeded 
    2. 我们关闭这个开关， -XX:-UseGCOverheadLimit
    3. java.lang.OutOfMemoryError: Java heap space 就会爆出堆内存溢出
## StringTable的垃圾回收机制

## Jconsole工具

# 线程运行原理
## 栈与栈帧
- 每个线程启动后，虚拟机就会为其分配一块栈内存
- 每个栈由多个栈帧组成，对应着每次方法调用时所占用的内存
## 线程上下文切换
因为以下一些原因导致CPU不再执行当前的线程，转而执行另一个线程的代码
- 线程的CPU时间片用完
- 垃圾回收
- 有更高优先级的线程需要运行 
- 线程自己调用了sleep、yield、wait、join、park、synchronized、lock等方法

当发生上下文切换的时候，需要由操作系统保存当前线程的状态，并恢复另一个线程的状态，java中对应的概念就是
程序计数器，它的作用就是用来记住下一条jvm指令的执行地址，是线程私有的，每一个线程都有一个私有的程序计数器记录其当前执行代码位置

## 线程常见方法
- start 启动一个新的线程，只是让线程进入就绪状态，里面的代码不一定立刻执行
- run  新线程启动后会调用的方法
- join 等待线程运行结束
- setName 设置线程名
- setPriority 修改线程优先级
- getState 获取线程状态




