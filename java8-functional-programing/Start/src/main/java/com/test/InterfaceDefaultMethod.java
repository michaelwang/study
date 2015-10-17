package com.test;

/**
 * Describe class InterfaceDefaultMethod here.
 *
 *
 * Created: Mon Sep 28 17:28:43 2015
 *
 * @author wangzhenhua
 * @version 1.0
 */
public class InterfaceDefaultMethod
{


    public static interface InterfaceDefaultMethodA
    {
        default void sayHi()
        {
            System.out.println("hi from interface");
        }
    }

    public static class InterfaceDefaultMethodAImpl implements InterfaceDefaultMethodA
    {

    }

    public static interface InterfaceChildMethodA extends InterfaceDefaultMethodA
    {
        default void sayHi()
        {
            System.out.println("hi from child interface");
        }
    }

    public static class InterfaceChildMethodAImpl implements InterfaceChildMethodA
    {

    }


    public  static void main(String args[])
    {
        InterfaceDefaultMethodA instance = new InterfaceDefaultMethodAImpl();
        instance.sayHi();

        InterfaceChildMethodA childInstance = new InterfaceChildMethodAImpl();
        childInstance.sayHi();
    }
}
