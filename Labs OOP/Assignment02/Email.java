
public class Email extends Text {
    private EmailAddress from;
    private EmailAddress to;
    private String subject;
    private String message;
    public Email(EmailAddress from, EmailAddress to, String subject, String message){
        this.from = from;
        this.to = to;
        this.subject = subject;
        this.message = message;
    }
    public EmailAddress getFrom(){
        return from;
    }
    public EmailAddress getTo(){
        return to;
    }
    public String getSubject(){
        return subject;
    }
    public String getMessage(){
        return message;
    }
    public void display(){
        System.out.println("From    "+from.getEmailAddress()+"\nTo:  "+to.getEmailAddress()+"\nSubject: "+getSubject()+"\nMessage: "+getMessage());
    }

}
