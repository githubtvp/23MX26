

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

    public void m2() {
        super.m1();
    }

    public String toString() {
        return super.toString() + super.toString();
    }
}

class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("Monster 1");
    }

    public void m2() {
        super.m1();
        super.m2();
    }

    public String toString() {
        return "monster " + super.toString();
    }
}



public class Main {
    public static void main(String[] args)
    {
        MonsterTruck mt = new MonsterTruck();
        mt.m1();
        mt.m2();
        System.out.println(mt);
    }


}