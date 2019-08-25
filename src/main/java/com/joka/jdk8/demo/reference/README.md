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