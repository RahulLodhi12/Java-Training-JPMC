package Session;

// NOTES:
// In Java, only 1 public class and multiple non-public classes is allowed.
// In Java, class name starts with Capital letter, means first letter is in Cap.
public class EnumDemo {
    public static void main(String[] args){
        new PizzaShop().getMenu();
    }
}

class PizzaShop{

    void getMenu(){
        PizzaSize size = PizzaSize.SMALL;
        System.out.println(size);

        System.out.println("All Pizza Size:");
        for(PizzaSize pSize: PizzaSize.values()){
//            System.out.println(pSize.name() + " " + pSize.getServing());
//            OR
            System.out.println(pSize + " " + pSize.getServing());
        }
    }

}

// In Java, constant variable are in All CAPITAL, means all letter in Cap.
enum PizzaSize{SMALL(2),MEDIUM(4),LARGE(8);
    //instance variable
    private int serving;

    //constructor
    PizzaSize(int serving){
        this.serving = serving;
    }

    int getServing(){
        return this.serving;
    }
}
