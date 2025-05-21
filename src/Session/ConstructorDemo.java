package Session;

public class ConstructorDemo {
    public static void main(String[] args){
        Truck t1 = new Truck();
        Truck t2 = new Truck("Black");
    }
}

class Truck{
    Truck(){
        System.out.println("Default Constructor");
    }

    Truck(String color){
        System.out.println("Constructor with color: "+color);
    }
}
