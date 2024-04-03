package com.test;

public class SwigJava {
    static {
        //DLL的名称
//        System.loadLibrary("I:\\codes\\java_demo1\\src\\main\\cpp\\SWIG_CPP.dll");
        System.loadLibrary("helloWorld4j_wrap");
        // 上面的是从变量java.library.path地方读取的
//        System.load("I:\\codes\\java_demo1\\src\\main\\cpp\\SWIG_CPP.dll");
        //System.load("I:\\codes\\java_demo1\\src\\main\\cpp\\helloWorld.dll");
        //System.load("I:\\codes\\java_demo1\\src\\main\\cpp\\helloWorld4j_wrap.dll");
    }

    public static void main(String[] args)
    {
        HelloWorld obj = new HelloWorld();
        System.out.println("对象方法调用=>"+obj .add(1, 2));
        System.out.println("全局函数调用=>"+HelloWord4j.multiply(2, 3));
    }
}
