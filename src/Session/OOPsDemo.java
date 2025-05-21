package Session;

public class OOPsDemo {
    public static void main(String[] args){
//        Car car = new Car();
//        car.color = "Black";
//        car.speed = 90;
//
//        car.drive();
//
//        Car otherCar = new Car();
//        otherCar.color = "Blue";
//        otherCar.speed = 120;
//
//        otherCar.drive();

        Car firstCar = new Car("Red",45);
        firstCar.drive();

    }
}

class Car{
    //instance variable
    String color;
    int speed;

    void drive(){
        System.out.println("Car is driving at speed: "+ this.speed);
    }

    //Note: Using this.speed is more explicit, and especially useful when there is a naming conflict, like:
    void setSpeed(int speed) {
        this.speed = speed; // distinguishes instance variable from parameter
    }

    Car(String carColor, int carSpeed){
        this.color = carColor; //OR color = carColor;
        this.speed = carSpeed; //OR speed = carSpeed;
    }

//    ✅ this Keyword
//    - Refers to the current object.
//    - Used for resolving naming conflicts and chaining constructors.
}
