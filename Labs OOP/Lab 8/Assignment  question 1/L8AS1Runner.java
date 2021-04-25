package com.company;
import java.util.Scanner;

public class L8AS1Runner {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Publication system");
        String[] s = {"if you are looking for books press 1,2,if you are looking for audio cassette,0,to return to main menu.Thanks deer"};
        System.out.println("Choose an option" + s[0] + s[1] + s[2]);
        choice = input.nextInt();
        while (choice >= 1 && choice < s.length) {
            if(choice == 0){
                System.out.println("Thanks for visiting our publication.");
            }
            else if (choice == 1) {
                System.out.println("Please enter book title,price and page count:");
                Book b1 = new Book(input.next(), input.nextDouble(), input.nextInt());
                b1.display();
            }
            else if (choice == 2) {
                System.out.println("Enter audio cassette's title,price and page count:");
                Tape t1 = new Tape(input.next(), input.nextInt(), input.next());
                t1.display();
            }
            System.out.println("Choose an option" + s[0] + s[1] + s[2]);
            choice = input.nextInt();
        }
    }
}
