package com.sapient.week1;
import com.sapient.week1.CheckEven;

public class App 
{
    public static void main( final String[] args) {
        // System.out.println( "Hello World!" );
        final CheckEven checkeven = new CheckEven();
        System.out.println("3 "+checkeven.check(3));
        System.out.println("4 "+checkeven.check(4));
        System.out.println("100 "+checkeven.check(100));
    }
}
