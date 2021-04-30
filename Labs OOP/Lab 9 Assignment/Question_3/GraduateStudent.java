class GradStudent extends Student{
    //Overriding the takeXam method in Student class and printing appropriate message
    @Override
    public void takeXam(){
        System.out.println("Giving Written paper!");
    }
}
public class Main
{
	public static void main(String[] args) {
	    //creating Objects of PhdStudent class and GradStudent class
	    PhdStudent s1=new PhdStudent();
	    GradStudent s2=new GradStudent();
	    //calling takeXam method from two Objects
	    s1.takeXam();
	    s2.takeXam();

