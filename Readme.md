## 评估算法优劣的核心指标是什么？
***
时间复杂度（流程决定）
额外空间复杂度（流程决定）
常数项时间（实现细节决定）

## 什么是时间复杂度？时间复杂度怎么估算？
***
常数时间的操作
确定算法流程的总操作数量与样本数量之间的表达式关系
只看表达式最高阶项的部分

## 何为常数时间的操作
***
如果一个操作的执行时间不以具体样本量为转移，每次执行时间都是固定时间。称这样的操作为常数时间的操作。

## 常见的常数时间的操作
***
常见的算术运算（+、-、*、/、% 等）
常见的位运算（>>、>>>、<<、|、&、^等）
赋值、比较、自增、自减操作等
数组寻址操作
总之，执行时间固定的操作都是常数时间的操作。
反之，执行时间不固定的操作，都不是常数时间的操作。

## 如何确定算法流程的总操作数量与样本数量之间的表达式关系？
***
1，想象该算法流程所处理的数据状况，要按照最差情况来。
2，把整个流程彻底拆分为一个个基本动作，保证每个动作都是常数时间的操作。
3，如果数据量为N，看看基本动作的数量和N是什么关系。

## 如何确定算法流程的时间复杂度？
***
当完成了表达式的建立，只要把最高阶项留下即可。低阶项都去掉，高阶项的系数也去掉。
记为：O(忽略掉系数的高阶项)、

## 注意：
***
1，算法的过程，和具体的语言是无关的。
2，想分析一个算法流程的时间复杂度的前提，是对该流程非常熟悉
3，一定要确保在拆分算法流程时，拆分出来的所有行为都是常数时间的操作。这意味着你写算法时，对自己的用过的每一个系统api，都非常的熟悉。否则会影响你对时间复杂度的估算。

## 时间复杂度的意义
***
抹掉了好多东西，只剩下了一个最高阶项啊…
**那这个东西有什么意义呢？**
时间复杂度的意义在于：
当我们要处理的样本量很大很大时，我们会发现低阶项是什么不是最重要的；每一项的系数是什么，不是最重要的。真正重要的就是最高阶项是什么。
这就是时间复杂度的意义，它是衡量算法流程的复杂程度的一种指标，该指标只与数据量有关，与过程之外的优化无关。

## 额外空间复杂度
***
你要实现一个算法流程，在实现算法流程的过程中，你需要开辟一些空间来支持你的算法流程。
作为输入参数的空间，不算额外空间。
作为输出结果的空间，也不算额外空间。
因为这些都是必要的、和现实目标有关的。所以都不算。
但除此之外，你的流程如果还需要开辟空间才能让你的流程继续下去。这部分空间就是额外空间。
如果你的流程只需要开辟有限几个变量，额外空间复杂度就是O(1)。

## 算法流程的常数项
***
我们会发现，时间复杂度这个指标，是忽略低阶项和所有常数系数的。
**难道同样时间复杂度的流程，在实际运行时候就一样的好吗？**
当然不是。
时间复杂度只是一个很重要的指标而已。如果两个时间复杂度一样的算法，你还要去在时间上拼优劣，就进入到拼常数时间的阶段，简称拼常数项。

## 算法流程的常数项的比拼方式
***
放弃理论分析，生成随机数据直接测。
**为什么不去理论分析？**
不是不能纯分析，而是没必要。因为不同常数时间的操作，虽然都是固定时间，但还是有快慢之分的。
比如，位运算的常数时间原小于算术运算的常数时间，这两个运算的常数时间又远小于数组寻址的时间。
所以如果纯理论分析，往往会需要非常多的分析过程。都已经到了具体细节的程度，莫不如交给实验数据好了。

## 面试、比赛、刷题中，一个问题的最优解是什么意思？
***
一般情况下，认为解决一个问题的算法流程，在时间复杂度的指标上，一定要尽可能的低，先满足了时间复杂度最低这个指标之后，使用最少的空间的算法流程，叫这个问题的最优解。
一般说起最优解都是忽略掉常数项这个因素的，因为这个因素只决定了实现层次的优化和考虑，而和怎么解决整个问题的思想无关。

## 常见的时间复杂度
***
排名从好到差：
O(1)   
O(log₂N)   
O(N)   
O(N*logN)   
O(N^2)   O(N^3)   …   O(N^K)
O(2^N)   O(3^N)   …   O(K^N)
O(N!)

## 对数器
***
1.你想要测的方法a
2.实现复杂度不好但是容易实现的方法b
3.实现一个随机样本产生器
4.把方法a和方法b跑相同的随机样本，看看得到的结果是否一样
5.如果有一个随机样本使得比对结果不一致，打印样本进行人工干预，改对方法a和方法b
6.当样本数量很多时比对测试依然正确，可以确定方法a已经正确。

## 认识二分法
***
经常见到的类型是在一个有序数组上，开展二分搜索
**但有序真的是所有问题求解时使用二分的必要条件吗？**
不
只要能正确构建左右两侧的淘汰逻辑，你就可以二分。

## 认识异或运算
***
异或运算：相同为0，不同为1
同或运算：相同以1，不同为0
能长时间记住的概率接近0%
所以，异或运算就记成无进位相加！
异或运算的性质：
1.0^N == N      N^N == 0
2.异或运算满足交换律和结合率
上面的两个性质用无进位相加来理解就非常的容易








