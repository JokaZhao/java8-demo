在JAVA8中，设计师引入了几个非常有用的函数式接口

Predicate接口：

有一个抽象的test方法，当你涉及到需要一个类型T的布尔类型时可以使用

    public static <T> List<T> filter(List<T> list, Predicate<T> p){
        List<T> result = new ArrayList<>();
        for(T t:list){
            if(p.test(t)){
                result.add(t);
            }
        }
        return result;
    }

Consumer接口：

有一个抽象的accept方法，接受泛型T的对象，没有返回.适用于需要访问某些类型T的对象，并且对其执行一些操作

Function接口：

有一个apply方法，接受一个泛型T的对象，并返回一个泛型R的对象

    public static <T,R> List<R> map(List<T> list, Function<T,R> f){
        List<R> result = new ArrayList<>();
        for(T t : list){
            result.add(f.apply(t));
        }
        return result;
    }


### 方法引用
类似于以下的代码方式：

    list.sort((Apple a1 , Apple a2) -> a1.getWeight().compareTo(a2.getWeight()));

使用方法引用后：

    list.sort(comparing(Apple::getWeight));

 方法引用就是让你根据已有的方法实现来创建Lambda表达式

 如何构建方法的引用：
 - 指向静态方法的方法引用（例如Integer的parseInt方法，写作Integer::parseInt）
 - 指向任意类型实例方法的方法引用（例如String的length方法，写作String::length）
 - 指向现有对象的实例方法的方法引用

 例子，对应上面三个说明：
 - (args) -> ClassName.staticMethod(args)   -->   ClassName::staticMethod
 - (arg0 , rest) -> arg0.instanceMethod(rest)  -->  ClassName::instanceMethod
 - (args) -> expr.instanceMethod(args)  -->  expr::instanceMethod

### 构造函数引用
对于一个现有构造函数，可以利用它的名称和关键字new来创建一个引用：ClassName::new

例子：

    Supplier<Apple> c1 = Apple::new;
    Apple a = c1.get();
 或者

    Function<Integer,Apple> c2 = Apple::new;
    Apple a2 = c2.apply(100);
