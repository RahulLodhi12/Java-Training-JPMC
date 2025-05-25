package Session;

public class InheritanceDemo {
    public static void main(String[] args){
        //The dot (.) operator is used with objects (non-primitive types) and class names
        // to access their members such as fields, methods, or inner classes.

        int value = 1234;
//        System.out.println(value.indexOf(2)); //error

        String s = "1234";
        System.out.println(s.indexOf("2")); //String is a class, so we can use dot(.) operator

        new Pradeep().play();

        new Pradeep().eat();
        new Human().eat();

        new Harshita().sing();

        new Harshita().walk();
        new Human().walk();
    }
}

class Human{ //parent
    void breathe(){
        System.out.println("Generic breathe()..");
    }

    void walk(){
        System.out.println("Generic walk()..");
    }

    void eat(){
        System.out.println("Generic eat()..");
    }
}

class Pradeep extends Human{ //child

    void play(){
        System.out.println("Pradeep play()..");
    }

    @Override
    void eat(){
        System.out.println("Pradeep eat()..");
    }
}

class Harshita extends Human{ //child

    void sing(){
        System.out.println("Harshita sing()..");
    }

    @Override
    void walk(){
        System.out.println("Harshita walk()..");
    }

}
