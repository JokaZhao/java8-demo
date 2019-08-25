可以把Lambda表达式理解为表示可传递的匿名函数的一种方式，它没有名称，但是有参数列表、函数主体、返回类型

lambda包含三个部分，参数、箭头和主体

lambda没有return语句，因为已经隐含return

    (String s) -> s.length()    --> 这个表达式表示一个String类型的参数，并且返回一个int
    (Apple apple) -> apple.getWeight() > 150    -->这个表达式表示一个Apple入参，并且返回一个boolean返回值
    (int x , int y) -> {
        System.out.println("result");
        System.out.println(x + y);
    }
    上面的表达式表示两个入参，并且没有返回值。多行语句可以用{}来表示
    () -> 42        --> 这个表示无入参，并且返回一个int

