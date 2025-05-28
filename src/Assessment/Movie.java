package Assessment;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        MovieBook movie = new MovieBook();

        movie.name = sc.nextLine();
        movie.price = sc.nextInt();
        movie.seats = sc.nextInt();
        movie.bookTickets();
    }
}

class MovieBook{
    String name;
    int price;
    int seats;
    int availableSeats = 100; //static variable

    void bookTickets(){
        if(availableSeats-this.seats>=0){
            System.out.println(seats+" seats are booked..");
        }
        else{
            System.out.println("Seats are Full..");
        }
    }
}
