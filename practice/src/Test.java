public class Test {
    //    public static void main(String[] args) {
//        System.out.println("sujata" +" "+ "K.C");
//        System.out.println("Sazn" +" "+ "Lamsal");
//    }
    final double pi = 3.14;
    static int myMethod(int x,int y){
        return (x +y);
    }
    static double myMethod(double x,double y){
        return (x +y);
    }
    static void myMethod(){
        System.out.println("Hello World!!");
    }
    public static  void  main(String[] args){
        int myNum = myMethod(5,5);
        double myNum1 =  myMethod(4.5,1.5);
        System.out.println(myNum);
        System.out.println(myNum1);
        myMethod();

    }
}

