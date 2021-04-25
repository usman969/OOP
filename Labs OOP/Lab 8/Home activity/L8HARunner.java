package com.company;

public class L8HARunner {
    public static void main(String[] args) {

        System.out.println("Student Details:");
        Student_1 s1 = new Student_1("Zahra","House no.1144,St.08,I-10,Islamabad","0333-5244850",
                "zahrasaeed61@gmail.com","Student");
        s1.display();

        System.out.println();
        System.out.println("Employee Details:");
        Date d1 = new Date(7,05,2016);
        Employee_1 e1 = new Employee_1("Nimra","House no.137,St.46,D-12,Islamabad","0333-1112223",
                "nimra12#gmail.com","PTV",35000,d1);
        e1.display();

        System.out.println();
        System.out.println("Faculty Details:");
        Date d2 = new Date(2,11,2013);
        Faculty f1 = new Faculty("Amna","House no.15,St.5,E-11,Islamabad","0344-5429638",
                "amna32@gmail.com","Ufone",55000,d2,7,"Manager");
        f1.display();

        System.out.println();
        System.out.println("Staff Details");
        Staff staff_1 = new Staff("Salaar","House no.11,Lane no.5,Peshawar Road,Rawalpindi",
                "0344-55778889","salaar121@gmail.com","GHQ",60000,d2,"Captain");
        staff_1.display();
    }
}
