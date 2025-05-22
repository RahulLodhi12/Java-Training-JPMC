package Session;

import java.util.Scanner;

public class MethodDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Method Session!!");

        //Syntax- Object-creation: new ClassName(); OR  new ClassName(arguments); OR ClassName refVar = new ClassName(with-without arguments); | here "refVar" store memory address
        new MethodDemo().met();

        greet(); //to call greet() method in this manner, we need to make greet() method static.
        // Otherwise, we need to make object of MethodDemo class just like for met() method: new MethodDemo().met();

        //Static method: To call static method we don't need to make Object of class.

        //Approach 1: To call a method by using ref-var, "cal"
        Calculate cal = new Calculate();
        System.out.println(cal.add(11,22));

        //Approach 2: To call a method without ref-var, only using object: new Calculate();
        System.out.println(new Calculate().add(11,22));

        //Approach 3: To call a method without ref-var, also taking input from run-time, without input variables
        System.out.println(new Calculate().add(sc.nextInt(),sc.nextInt()));

        System.out.println(new Calculate().add(sc.nextInt(),sc.nextInt(),sc.nextInt()));

        //void add()
        new Calculate().add();
    }

    //Both met() and greet() are method of MethodDemo class,

    void met(){ //
        System.out.println("Inside met()..");
    }

    static void greet(){
        System.out.println("Greeting say Hello!");
    }
}

class Calculate{
    //	Method Overloading - Method name should be same.
    //	3 conditions:
    //	1. no. of arguments different
    //	2. type of arguments different
    //	3. order of arguments different

    // NOTE: Java doesn’t consider return type for method signature,
    // so overloading by return type alone causes a compile-time error.
    // In short, "return type" doesn't consider for method overloading

    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }

    void add(){
        System.out.println(90+88);
    }
}


