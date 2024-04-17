package Activity8;

public class Encapsulation {
    private String Name;
    private String ID;
    private int age;
    
    public int getAge(){
        return age;
    }
    
    public String getName(){
        return Name;
    }
    
    public String getID(){
        return ID;
    }
    
    public void setAge(int newAge){
        age = newAge;
    }
    
    public void setName(String newName){
        Name = newName;
    }
    
    public void setIdNum(String newID){
        ID = newID;
    }
}
