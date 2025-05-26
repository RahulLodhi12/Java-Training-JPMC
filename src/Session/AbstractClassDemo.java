package Session;

//NOTE: "public" -> Access Modifier and "static" -> Non-Access Modifier

/*
- An abstract class is a class that cannot be instantiated(cannot make object) on its own and is meant to be inherited by subclasses.
- It can have abstract methods (without implementation/body) as well as concrete methods (with implementation/body).
*/
/*
Important Points:
| Feature                   | Description                                                                            |
| ------------------------- | -------------------------------------------------------------------------------------- |
| `abstract` keyword        | Used to declare a "class or method" abstract                                           |
| Can't instantiate         | You cannot do `new Animal()` if Animal is abstract                                     |
| Can have constructors     | Used to initialize common fields                                                       |
| Can have concrete methods | Unlike interfaces (before Java 8), abstract classes can define method bodies           |
| Can have member variables | Both final and non-final, static or non-static                                         |
| Supports inheritance      | Subclasses must implement all "abstract methods" unless they are abstract themselves   |

*/
public class AbstractClassDemo {
    public static void main(String[] args){

//        new Vehicle().makeSound(); //error: cannot be instantiated(cannot make object), since Vehicle is abstract class.

        new Bike().makeSound();
        new Bike().speed();

        new Male().displayType();
//        new Male("female").displayType();

    }
}

//Simple Abstract Class Example with abstract and concrete method
abstract class Vehicle{
    //abstract method
    abstract void speed();

    //concrete method
    void makeSound(){
        System.out.println("Vehicle sound..");
    }
}

class Bike extends Vehicle{
    //NOTE: If an abstract method is implemented(body) in its subclass, then it's an overriding of method(abstract method).
    @Override
    void speed() {
        System.out.println("Bike speed..");
    }
}


//Abstract Class with Constructor
abstract class Gender{
    String genderType; //instance variable

    //Constructor can be private, public, protected, package-private(default)
    public Gender(String genderType){
        this.genderType = genderType;
    }

    public Gender(){
        System.out.println("Gender constructor..");
    }

    abstract void displayType(); //abstract method
}

class Male extends Gender{
    //You can’t instantiate "Gender" class, but the constructor is called automatically when a subclass "Male" is instantiated.
    public Male(){
//        super("male");
        super(); //Java automatically inserts super() as the first line. If we did not explicitly call super(...)
    }

    public Male(String type){
        super(type);
    }

    @Override
    void displayType() {
        System.out.println("Gender Type is: " + this.genderType); //genderType is inherit from Gender(parent) class
    }
}


