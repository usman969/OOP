
package l4hac3.L4HAC3;


public class Runner {

    
    public static void main(String[] args) {
         int [] r_arr1 = {76, 82, 91, 77, 80};
        Student s1 = new Student("Ali", r_arr1);
        System.out.println("Average of Student 1 is: "+s1.Average());
        
        int [] r_arr2 = {84, 87, 98, 75, 88};
        Student s2 = new Student("Sheryar", r_arr2);
        System.out.println("Average of the Studetn 2 is: "+s2.Average());
        
        if (s1.Average()>s2.Average()){
            System.out.println("Student 1 has higher Average i.e "+s1.Average());
        }
        else 
            System.out.println("Student 2 has higher Average i.e "+s2.Average());
        
        Student s3 = new Student(s1.getName(),s2.getResult());
        System.out.println("Average of the Studetn 3 is: "+s3.Average());
        
              
    }
    
}
    
    
