package com.javacode.lambdaDemo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Description:
 * @Author hans
 * @Date 2019/3/22 14:38
 * @Version 1.0
 */
public class LambdaDemo2 {
    public static LambdaDemo2 create( final Supplier< LambdaDemo2 > supplier ) {
        return supplier.get();
    }

    public static void collide( final LambdaDemo2 car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final LambdaDemo2 another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }

    public static void main(String[] args) {
        Action1 supplier = LambdaDemo2::new;
//        supplier.
        final LambdaDemo2 car = LambdaDemo2.create( LambdaDemo2::new );
        final List< LambdaDemo2 > cars = Arrays.asList( car );
    }
}
