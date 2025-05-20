package Assessment_1;

import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Which Conversion ? Select 1 or 2:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("Enter 1 or 2: ");
        int choice = sc.nextInt();

        TempConverter converter = new TempConverter();

        if(choice==1){
            converter.CelToFah(sc.nextInt());
        }
        else if(choice==2){
            converter.FahToCel(sc.nextInt());
        }
        else{
            System.out.println("Invalid choice..");
        }
    }
}

class TempConverter{
    void CelToFah(int cel){
        int fah = ((cel*9)/5)+32;
        System.out.println(fah);
    }

    void FahToCel(int fah){
        int cel = ((fah-32)*5)/9;
        System.out.println(cel);
    }
}
