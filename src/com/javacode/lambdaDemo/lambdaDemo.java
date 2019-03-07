package com.javacode.lambdaDemo;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/1 15:08
 * @Version 1.0
 */
public class lambdaDemo {
    public static void main(String[] args) {

        lambdaDemo t = new lambdaDemo();
        //      也可以先创建对象
        //      Action1 a1 = ()->System.out.println("hello");

        t.test1(()->System.out.println("hello"));

        //Action2<String,Integer> a2 = (f)->"这个数字是:"+f;
        //如果参数就一个,那么还可以这样简写 去掉小括号
        Action2<String,Integer> a2 = f->"这个数字是:"+f;
        t.test2(a2);
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