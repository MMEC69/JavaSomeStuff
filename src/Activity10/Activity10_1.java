package Activity10;

public class Activity10_1 {
    public static void main(String args[]){
        PEmployee permanant = new PEmployee();
        TEmployee temporary = new TEmployee();
        System.out.println("Permanant Employee total leaves: \n"+permanant.leaves);
        System.out.println("Number of working hours for Permanant Emplyee are: \n"+permanant.totalHoursPerDay);
        System.out.println("Temporary Employee Total number of leaves are: \n"+temporary.leaves);
        System.out.println("Number of working hours for Temporary Employee are:\n"+temporary.totalHoursPayDay);
    }
}

class Employee{
    double leaves = 25.00;
}

class PEmployee extends Employee{
    float totalHoursPerDay = (float)8.00;
}

class TEmployee extends Employee{
    float totalHoursPayDay = (float) 10.50;
}


