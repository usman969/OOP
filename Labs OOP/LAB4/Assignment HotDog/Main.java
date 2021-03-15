package com.company;

public class Main {

    public static void main(String[] args) {
        HotDogStand dog1 = new HotDogStand(1111, 20);
        HotDogStand dog2 = new HotDogStand(2222, 0);
        HotDogStand dog3 = new HotDogStand(3333, 10);

        dog1.justSold();
        dog1.justSold();
        dog1.justSold();

        dog2.justSold();
        dog2.justSold();
        dog2.justSold();
        dog2.justSold();
        dog2.justSold();

        dog3.justSold();
        dog3.justSold();

        System.out.printf("%-10s%10s\n", "StandsID", "DogsSold");
        System.out.println("---------------------");
        System.out.printf("%-10d%10d\n", dog1.getStandsID(), dog1.getHotDogsSold());
        System.out.printf("%-10d%10d\n", dog2.getStandsID(), dog2.getHotDogsSold());
        System.out.printf("%-10d%10d\n", dog3.getStandsID(), dog3.getHotDogsSold());

        System.out.println(
                "\nTotal number of hot dogs sold by all hot dog stands: "
                        + HotDogStand.getTotalHotDogsSold());
    }
}
