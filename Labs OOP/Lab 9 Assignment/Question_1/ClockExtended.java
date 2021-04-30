class ClockExtended extends Clock
    
    {
    public ClockExtended(String hrs, String min, String sec){
        super(hrs, min, sec);
    }
    public void display(){
        System.out.println("24 hr Format:");
        super.display();
        System.out.println("12 hr Format:");
        int hr1 = (int)hrs.charAt(0) - '0';
        int hr2 = (int)hrs.charAt(1)- '0';
        int tothr = hr1 * 10 + hr2;
        String m;
        if(tothr < 12)
            m="AM";
        else
            m="PM";
        tothr %= 12;
        if (tothr == 0) {
            System.out.print("12");
            System.out.print(":"+min+":"+sec);
        }
        else{
            System.out.print(tothr);
            System.out.print(":"+min+":"+sec);
        }
        System.out.println(" "+m);
    }
}


public class Main
{
	public static void main(String[] args) {
	    ClockExtended time=new ClockExtended("00","30","20");
	    time.display();
	}
}

