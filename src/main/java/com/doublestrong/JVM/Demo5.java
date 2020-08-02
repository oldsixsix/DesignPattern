package com.doublestrong.JVM;

/**
 * @author Double strong
 * @date 2020/6/29 17:55
 */
public class Demo5 {
    public static void main(String[] args) {
//        StringTable的垃圾回收机制
//        1.设置虚拟机参数
//        -Xmx10m(设置堆内存大小10m) -XX:+PrintStringTableStatistics（打印串池中的信息） -XX:+PrintGCDetails -verbose:gc(打印垃圾回收的详细信息)
        int i=0;
        try {
            for (int j=0;j<100;j++)
            {
                String.valueOf(j).intern();
                i++;
            }
        }
        catch (Throwable e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println(i);
        }
    }
/*

Heap 打印堆内存的占用情况
 PSYoungGen      total 2560K, used 585K [0x00000000ffd00000, 0x0000000100000000, 0x0000000100000000)
  eden space 2048K, 5% used [0x00000000ffd00000,0x00000000ffd1a6b8,0x00000000fff00000)
  from space 512K, 93% used [0x00000000fff00000,0x00000000fff78020,0x00000000fff80000)
  to   space 512K, 0% used [0x00000000fff80000,0x00000000fff80000,0x0000000100000000)
 ParOldGen       total 7168K, used 264K [0x00000000ff600000, 0x00000000ffd00000, 0x00000000ffd00000)
  object space 7168K, 3% used [0x00000000ff600000,0x00000000ff642010,0x00000000ffd00000)
 Metaspace       used 3451K, capacity 4496K, committed 4864K, reserved 1056768K
  class space    used 376K, capacity 388K, committed 512K, reserved 1048576K

SymbolTable statistics: 符号表
Number of buckets       :     20011 =    160088 bytes, avg   8.000
Number of entries       :     14120 =    338880 bytes, avg  24.000
Number of literals      :     14120 =    600576 bytes, avg  42.534
Total footprint         :           =   1099544 bytes
Average bucket size     :     0.706
Variance of bucket size :     0.709
Std. dev. of bucket size:     0.842
Maximum bucket size     :         6

StringTable statistics: 字符串常量池统计表，其底层就是hash表
Number of buckets       :     60013 =    480104 bytes, avg   8.000
Number of entries       :      1756 =     42144 bytes, avg  24.000
Number of literals      :      1756 =    157336 bytes, avg  89.599
Total footprint         :           =    679584 bytes
Average bucket size     :     0.029
Variance of bucket size :     0.029
Std. dev. of bucket size:     0.171
Maximum bucket size     :         2
 */
}
