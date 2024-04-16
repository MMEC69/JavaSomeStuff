package Activity6;

public abstract class Activity6_1 {
    private String Name;
    private String Gender;
    
    public Activity6_1(String nm, String Gen){
        this.Name = nm;
        this.Gender = Gen;
    }
    
    public abstract void work();
    
    @Override
    public String toString(){
        return "Name " +this.Name +"::Gender "+this.Gender;
    }
    
    public void changeName(String newName){
        this.Name = newName;
    }
    
    public void Office(){
        
    }
    
    public static void main(String args[]){
    
    }
}
