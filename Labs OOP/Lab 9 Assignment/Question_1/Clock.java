class Clock{
    String hrs, min, sec;
    public Clock(String hrs, String min, String sec){
        this.hrs=hrs;
        this.min=min;
        this.sec=sec;
    }
    //display method to display the time in 24 hr Format
    public void display(){
        System.out.println(this.hrs+":"+this.min+":"+this.sec);
    }
}

