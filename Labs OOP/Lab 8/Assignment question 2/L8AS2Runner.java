public class L8AS2Runner {
    public static void main(String[] args) {
        System.out.println("PC 1 Details:");
        PC c1 = new PC(32,6400,16000,52);
        c1.display();
        System.out.println("\nLaptop 1 Details:");
        Laptop l1 = new Laptop(32,6400,16000,52,10,15,20,100);
        l1.display();
        // Using set and get methods
        System.out.println("\nPC 2 Details:");
        PC c2 = new PC();
        c2.setWord_size(64);
        c2.setMemory_size(45000);
        c2.setStorage_size(72000);
        c2.setspeed(1000);
        c2.display();

        System.out.println("\nLaptop 2 Details:");
        Laptop l2 = new Laptop();
        l2.setWord_size(64);
        l2.setMemory_size(45000);
        l2.setStorage_size(72000);
        l2.setspeed(1000);
        l2.setLength(15);
        l2.setWidth(15);
        l2.setHeight(20);
        l2.setWeight(105);
        l2.display();
    }
}
