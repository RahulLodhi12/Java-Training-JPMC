package Session;

public class NullingReferenceDemo {
    public static void main(String[] args){
        Student student1 = new Student();
        Student student2 = new Student();

        student1 = null; //nulling a reference
        student2 = null;


//        student1.marks();
//        student2.marks();

        student1 = new Student();
        student1.marks(); //Reassigning a reference


        Some a = new Some();
        Some b = new Some();
        Some c = new Some();

        a.ref = b;
        b.ref = c;
        c.ref = a;

////        a=b=c=null; //nulling the reference, -> All 3 objects are eligible for G.C (Garbage Collection)
//
//        a=b=null; // "Non" are eligible for G.C (Garbage Collection)
//        System.out.println(c);

        a.chip = b; //Some.chip = b
        b.chip = c; //Some.chip = c
        c.chip = a; //Some.chip = a

        a=b=c=null;

        System.out.println(Some.chip);

    }
}

class Student{
    void marks(){
        System.out.println("Students marks..");
    }
}

class Some{
    Some ref; //instance, [default value - null]

    static Some chip; //static, [default value - null], static member allocated in memory when it's class is loaded.
}
