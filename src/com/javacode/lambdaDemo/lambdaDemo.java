package com.javacode.lambdaDemo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/1 15:08
 * @Version 1.0
 */
public class lambdaDemo {
    public static void main(String[] args) {
        Stream.of("1",2,3,"wer").peek();
//        Test<lambdaDemo> tt = lambdaDemo::new;
        Test<lambdaDemo> tt = () -> new lambdaDemo();
        lambdaDemo t = tt.testAAA();
        //      也可以先创建对象
        //      Action1 a1 = ()->System.out.println("hello");

        t.test1(()->System.out.println("hello"));
        Action1 a = ()->System.out.println("hello");

        //Action2<String,Integer> a2 = (f)->"这个数字是:"+f;
        //如果参数就一个,那么还可以这样简写 去掉小括号
        Action2<String,Integer> a2 = f->"这个数字是:"+f;
        t.test2(a2);
//        List<String> ax = new ArrayList<>();
//        ax.forEach();
    }


    public void test1(Action1 a){
        a.run();
    }
    public void test2(Action2<String,Integer> a){
        System.out.println(a.run(3));
    }

}
//这个注解不加也可以,加上只是为了让编译器检查
@FunctionalInterface
interface Action1{
    void run();
}

//这个注解不加也可以,加上只是为了让编译器检查
@FunctionalInterface
interface Action2<T,F>{
    T run(F f);
}

@FunctionalInterface
interface Test<T>{
    T testAAA();
    boolean equals(Object o);
//    boolean equal(Object o);
}