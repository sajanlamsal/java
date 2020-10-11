package com.sujata.test;


interface A//no body of method,  must include all methods in child class that implements interfaces,
// interface extend only one interface,   class implements many nos of interface,  cant have obj so child class take
// reference of super class and make obj to call method, variables are by default public,static and final
{
    int x=10;
    public void myMethod1();
}
interface B
{
    int x=100;
    public void myMethod2();
}

 public class Hello implements A,B
{
    @Override
    public void myMethod1() {
        System.out.println("Method 1");
    }

    @Override
    public void myMethod2() {
        System.out.println("Method 2");
    }

    public static void main(String args[])
    {
        /* reference to x is ambiguous both variables are x
         * so we are using interface name to resolve the
         * variable
         */
       // System.out.println(x); same named variable so must call class or interface name like below
        System.out.println(A.x);
        System.out.println(B.x);
        A myObj = new Hello();
        myObj.myMethod1();
        System.out.println("==============");
        B myObj1 = new Hello();
        myObj1.myMethod2();//Method 1 ============== Method 2 as output if interface don't extend other interface


    }


}