package Session;



//Key Points:
/*
    - Collections are dynamic at run-time
    - Java Collections are a framework made up of interfaces, abstract classes, and concrete classes that
      allow you to work with groups of objects (collections) such as lists, sets, maps, and queues.
    - "Collections" are classes and "Collection" are interface.
    - Java collections (like ArrayList, HashSet, etc.) are designed to store objects, not primitive types
      like int, double, char, etc. E.g. ArrayList<int> list = new ArrayList<>(); // ❌ Compilation Error – primitive types not allowed
    - To store primitive values(int,double,etc) in collections, you must use wrapper classes(Integer,Double,etc), which are part of java.lang
    - ArrayList<Integer> list = new ArrayList<>();
      list.add(10); // Auto-boxing: primitive int → Integer object
    - Interface: List, Set, Map, Queue, etc.
    - We can't use Interface, so we need to use their subclasses. E.g. List -> Interface and ArrayList -> Subclass(class) of List, i.e. List<Integer> lst = new ArrayList<>();
*/


import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        new ListDemo().work();

//        new SetDemo().work();

//        new MapDemo().work();
    }
}

class ListDemo{
    void work(){
        //ArrayList
        List list = new ArrayList();

        //add
        list.add("TCS");
        list.add(112); //auto-boxing [int -> Integer] //same as -> list.add(new Integer(112));
        list.add(89.77f);
        list.add(false);
        list.add(new Phone(8,128,"iQOO"));

        System.out.println(list);

        //remove
        list.remove(2);
        list.remove(new Integer(112)); //Pass by object, -> "new" keyword.

        System.out.println(list);

        //iterations
        for(Object values: list){
            System.out.println(values);
        }

        //down-casting, when some conversion happens
        for(Object values: list){
            if(values instanceof String) { //safe down-casting. -> [parent instanceof child]
                String s = (String) values; //down-casting
            }
        }

        //LinkedList
        List list1 = new LinkedList(); //In this assignment, only method of "List" interface are accessible. e.g. here, addFirst() not accessible.
        LinkedList list2 = new LinkedList(); //In this assignment, only method of "LinkedList" class are accessible. e.g. here, addFirst() is accessible.

        list2.add("TCS");
        list2.add(112); //auto-boxing [int -> Integer] //same as -> list.add(new Integer(112));
        list2.add(89.77f);
        list2.add(false);
        list2.add(new Phone(8,128,"iQOO"));


        System.out.println(list2);

        list2.addFirst("rahul");

        System.out.println(list2);

        list2.add(2,list);

        System.out.println(list2);
    }
}

class SetDemo{
    //Not Overloading, -> "For overloading, methods should be in the same class"
    void work(){
        //Key Points: HashSet
        /*
        - Not order and Not-sorted
        - No "get()" method, since "ordering" is not guarantee.
        - No duplicates
        - HashSet is a class and Set is an interface.
        */
        HashSet set = new HashSet();

        set.add("WWE");
        set.add(890);
        set.add(true);
        set.add(1911f); //no ordering maintain
        set.add(890); //no duplicates

        System.out.println(set);


        //Key Points: TreeSet
        /*
        - Order(natural ordering)
        - Sorted
        - Homo object only, No hetero object
        - Sort objects only at run-time, not at compile-time
        */
        TreeSet set1 = new TreeSet();


//        set1.add("iphone");
//        set1.add(777);
//        set1.add(false);
//        set1.add(33.33f);

//        System.out.println(set1); //"set" sorts at only run-time, not at compile-time. [reason for error: Hetero objects are not allowed in TreeSet, only Homo objects are allowed.]

        set1.add(344);
        set1.add(112);
        set1.add(554);
        set1.add(889);
        set1.add(772);

        System.out.println(set1);
    }
}

class MapDemo{
    void work(){
        //Key Points: HashMap
        /*
        - Not order and Not sorted
        - Key-value pairs
        - Key have to be unique, but values can be duplicates
        - Key can be null.
        */
        HashMap map = new HashMap();

        map.put(11,"rahul");
        map.put("lodhi",new Phone(16,128,"samsung"));
        map.put('c',new ArrayList(Arrays.asList(11,22,33)));

        System.out.println(map);
    }
}

class Phone{
    int ram;
    int storage;
    String brand;

    public Phone(int ram, int storage, String brand){
        this.ram = ram;
        this.storage = storage;
        this.brand = brand;
    }
}
