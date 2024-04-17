class Car {
    public void m1() {
        System.out.println("car 1");
    }

    public void m2() {
        System.out.println("car 2");
    }

    public String toString() {
        return "vroom";
    }
}
class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
}

public class Main
{
    public static void main(String[] args) {
        Car mycar = new Car();
        Truck mytruck = new Truck();
        System.out.println(mycar);//vroom
        mycar.m1();//   car 1
        mycar.m2();//car 2
        System.out.println(mytruck);//vroom
        mytruck.m1();//truck 1
        mytruck.m2(); // car2
    }
}


//mycar.m1();
//mycar.m2();
//System.out.println(mytruck);
//mytruck.m1();
//mytruck.m2();
