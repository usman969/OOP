
import java.util.*;
public class Runner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the sender email:");
        String sender = input.next();
        System.out.println("Please Enter the receiver email:");
        String receiver = input.next();
        System.out.println("Please Enter the Subject:");
        String subject = input.next();
        System.out.println("Please Enter the Message:");
        String message = input.next();
        EmailAddress from = new EmailAddress(sender);
        EmailAddress to = new EmailAddress(receiver);
        Email email = new Email(from, to, subject, message);

        email.addPara("This is another para that has been added");
        email.display();
        BookChapter bookChapter = new BookChapter("Polymers", 07, "Contents about polymers are as under");
        bookChapter.display();
        
    }
}
