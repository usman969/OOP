
package l4hac.L4HAC;


public class Marks {
    private int mark1 , mark2 , mark3;
    
    
    public Marks() {
        
        mark1 = 5; mark2 = 6; mark3 = 7;
        
}
    public Marks ( int m1, int m2 , int m3 ) {
        mark1 = m1; mark2 = m3; mark3 = m3;
    }
    
    public void setM1(int m1) {
        mark1 = m1;
    }
    
    public void setM2(int m2) {
        mark2 = m2;
    }
    
    public void setM3(int m3) {
        mark3 = m3;
    }
    
    public int getM1() {
        return mark1;
    }
    
    public int getM2() {
        return mark2;
    }
    
    public int getM3() {
        return mark3;
    }
   
   
             
}
    

