package Activity8;

public class Activity8_1 {
    public static void main(String args[]){
        Encapsulation encapsulate = new Encapsulation();
        encapsulate.setName("Harry");
        encapsulate.setAge(25);
        encapsulate.setIdNum("829468");
        
        System.out.println("Name : "+encapsulate.getName() +"Age : "+encapsulate.getAge() +" ID: "+encapsulate.getID());
    }
}
