package com.java.jpa.com.sushanto.jpa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int a=12;
    	int b=20;
        System.out.println( "sum ="+(a+b));
        Multiple res=new Multiple();
        int ans=res.multiply(7, 8);
        System.out.println("Multiply =" + ans);
    }
}
