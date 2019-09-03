### fork/join 框架
以递归的方式将并行的任务拆分成更小的任务，然后把每个子任务的结果合并生成整体结果。

#### ForkJoinPool
它是ExecutorService接口的实现，要把任务提交到这个池，必须创建RecursiveTask<R>，其中R是并行化任务产生的结果类型，或者如果任务不
返回结果，则是RecursiveAction类型

要定义RecursiveTask，只需要实现它唯一的抽象方法

合理的RecursiveTask应该是如下格式
    
    if(任务足够小或不可分){
        顺序计算该任务
    }else{
        将任务分成两个任务
        递归掉用本方法，拆分每个子任务，等待子任务完成
        合并每个子任务的结果
    }
   
最佳使用：
- 对一个任务调用join方法会阻塞调用方，直到该任务出结果，所以有必要在任务计算都开始之后再调用join方法
- 不应该在RecursiveTask内部使用ForkJoinPool的invoke方法
- 对于任务调用fork方法，可以把它排进ForkJoinPool
- 不应理所当然地认为使用该框架就比顺序计算快
