Lambda是一次性的，使用完一次就关闭了，比如下面的例子，是不允许输出两次的

    List<String> lists = Arrays.asList("1","2");
    Stream<String> s = list.stream();
    s.foreach(System.out::prinlt);
    s.foreach(System.out::print);

方法示例：
- filter：接收lambda，从流中排除某些元素
- map:接收一个lambda，将元素转换为其他形式或者提取信息，相对于映射
- ship:跳过元素
- limit:截断流，使其元素不超过给定的数量
- sorted:排序
- distinct:过滤重复值，通过对象的hashcode和equal方法
- count:返回一个数量结果
- collect: 将流转换为其他形式
- allMatch：传入一个lambda，看流中的内容是否都匹配，返回一个boolean
- anyMatch:传入一个lambda，看流中的内容是否存在一个或者以上匹配，返回一个boolean
- noneMatch：传入一个lambda，看流中的内容是否都不匹配，返回一个boolean
- findAny：返回一个一个Optional对象，返回流中第一个对象
- findFirst:返回一个一个Optional对象，返回流中第一个对象,优先使用findAny，因为在并行中效率更高
- reduce:归约，传入一个lambda，将所有元素反复结合起来，得到一个新的值
- flatMap:将多个流合成一个流

Lambda分为两种类型：

1. 中间类型

诸如filter或者sorted等中间操作都会返回另一个流，在中间操作中不会执行任何处理，比如map、limit、filter等操作都是中间操作

2. 终端操作

终端操作会从流中生成另外一个结果，比如List、Integer，比如foreach（）、count()、collect()

