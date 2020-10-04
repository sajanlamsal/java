import com.sujata.test.Car;
import com.sujata.test.Toyota;

public class Test {
    //    public static void main(String[] args) {
//        System.out.println("sujata" +" "+ "K.C");
//        System.out.println("Sazn" +" "+ "Lamsal");
//    }

    public String model;
    public String name;
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
        Car car = new Car("volvo","fsadfsad");
        Car car2 = new Car();

        car2.setName("test");
        car2.setName("dasdas");
        car2.setModel("dasDASD");

        System.out.println(car2.getMirror());


        System.out.println(car2.getName());
        System.out.println(car.getModel());

        car.setName("nanp");
        System.out.println(car.getName());
        System.out.println("============================");

        Toyota toyota = new Toyota();
        System.out.println(toyota.getMirror());
        toyota.setTyre(4)        ;

        System.out.println(toyota.getTyre());

        Car abc = getCar();
        System.out.println(abc.getName());
    }


    public static Car getCar(){
        Car abccar= new Car();
        abccar.setMirror(5);
        return  abccar;
    }
}

