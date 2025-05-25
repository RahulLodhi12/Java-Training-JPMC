package Session;

//Rules of Overriding:
/*
| Rule | Description                                                                                       |
| ---- | ------------------------------------------------------------------------------------------------- |
| 1    | The method must have the same "name", "return type", and "parameters" as in the superclass. |
| 2    | The method must be "inherited" from the parent class.                                           |
| 3    | "Access modifier" of the overriding method should be "same or more accessible".               |
| 4    | "Private", "static", and "final" methods "cannot be overridden".                          |
| 5    | "Constructors cannot be overridden." -> In Java, only methods are inherited — constructors are not.                                                           |
| 6    | You can use `@Override` annotation to ensure you're actually overriding.                          |

 */
public class OverridingDemo {
    public static void main(String[] args){
        new Child().eat();
        new Parent().eat();

        Parent parent = new Child(); //Up-casting
        parent.eat();

        new Laptop().perform();
        new Hp().perform();

        Laptop laptop = new Hp(); //Up-casting: Parent(left)[Type] = Child(right)[Object]
        laptop.perform();

        new Shape().draw();
        new Circle().draw();

        Shape shape = new Circle();
        shape.draw();


        Animal animal = new Dog(); //up-casting (Dog->Animal), Implicit(auto)
        animal.sound();
//        animal.fetch(); //not accessible
        /*
            ❓ Why animal.fetch() is not accessible?
                Because:
                The reference type (Animal) determines what methods can be accessed at compile-time,
                not the actual object (Dog) it refers to.
        */

//        Dog dog = new Dog();
//        dog.sound();
//        dog.fetch();

        Dog dog = (Dog)animal; //Down-casting (Animal->Dog), Explicit (manual)
        dog.fetch();

        //NOTE: Down-casting is only meaningful and safe if the object was originally upcasted.
        //It means, first "up-cast" and only then we can "down-cast".
        Animal animal1 = new Dog(); //up-casting
        if(animal1 instanceof Dog){ //down-casting process
            Dog dog1 = (Dog)animal1;
            dog1.fetch();
        }
        else{
            System.out.println("Dog details not fetch..");
        }

        /*
        ❓ Why can’t static methods be overridden in Java?
        🔹 Because static methods belong to the class, not the instance/object.
        🔸 Overriding works with dynamic (runtime) dispatch — that only applies to instance methods.
        🔸 But static methods are resolved at compile-time using reference type, not object type.
        */


        College.placement();
        Branch.placement();

        College college = new Branch();
        college.placement(); //since "placement()" is static, means it can't be overridden.
    }
}

//Simple Example of Overriding
class Parent{
    void eat(){
        System.out.println("Parent eat()..");
    }
}

class Child extends Parent{
    @Override
    void eat() {
        System.out.println("Child eat()..");
    }
}

//Overriding Rule with Access Modifier(A.M)
class Laptop{
    protected void perform(){
        System.out.println("Inside Laptop class..");
    }
}

class Hp extends Laptop{
    @Override
    public void perform() { //in-place of "public", we can also use "protected"
        System.out.println("Inside Hp class..");
    }
}
/*
| Access Modifier | Same Class | Same Package | Subclass (other package) | Other Classes |
| --------------- | ---------- | ------------ | ------------------------ | ------------- |
| `public`        | ✅         | ✅           | ✅                       | ✅             |
| `protected`     | ✅         | ✅           | ✅                       | ❌             |
| (default)       | ✅         | ✅           | ❌                       | ❌             |
| `private`       | ✅         | ❌           | ❌                       | ❌             |
*/

//Accessibility Order: public > protected > package-private(default) > private

//Overriding Rule with Access Modifier(A.M):
//Thumb Rule: A.M (parent method) <= A.M (child method)



//Compile-time Polymorphism - Achieved by: Method Overloading
//Runtime Polymorphism - Achieved by: Method Overriding + Upcasting
class Shape{
    void draw(){
        System.out.println("Drawing a Shape..");
    }
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing a Circle..");
    }
}


//Upcasting - Done automatically by the compiler (implicit casting).
//Syntax - Parent p = new Child();
//Upcasting is commonly used when we are dealing with abstract classes or interfaces to achieve runtime polymorphism.
/*
💡 Why?
Because:
- Abstract classes and interfaces cannot be instantiated directly, means object can't be created of abstract class and interface.
- You often create an object of a concrete subclass, but refer to it using a reference of the abstract class or interface type.
- This is upcasting.
*/
class Animal{
    void sound(){
        System.out.println("Animal sound..");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Dog sound..");
    }

    void fetch(){
        System.out.println("Fetch Dog details..");
    }
}

class College{
    static void placement(){
        System.out.println("College Avg. Package 4LPA");
    }
}

class Branch extends College{
    //static methods are inherited — but they are not overridden
    static void placement(){
        System.out.println("Branch Avg. Package 6LPA");
    }
    /*
    - Static methods belong to the class, not to instances.
    - So, they can be accessed by subclasses, but calling them uses the reference type, not the actual object type.
    */
}

/*
❓ Why don’t constructors get inherited in Java?
🔑 Because constructors are tightly bound to their class and
are not meant to be reused by child classes.
- A constructor’s main role is to initialize the specific fields of its class.
*/