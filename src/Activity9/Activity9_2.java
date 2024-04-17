package Activity9;

public class Activity9_2 {
    
    public static void main (String args[]){
        Ninja1000R obj = new Ninja1000R();
        obj.BikeType();
        obj.brand();
        obj.speed();
        
    }
    
}

class Bike{
    public Bike(){
        System.out.println("Segment: 1000cc");
    }
    
    public void BikeType(){
        System.out.println("Bike Type: Sports");
    }
}

class Ninja extends Bike{
    public Ninja(){
        System.out.println("Make Ninja");
    }
    
    public void brand(){
        System.out.println("Manufacturer: Kawasaki");
    }
    
    public void speed(){
        System.out.println("Max speed: 290Kmph");
    }
}

class Ninja1000R extends Ninja{
    public Ninja1000R(){
        System.out.println("Ninja Model: 1000R");
    }
    
    public void speed(){
        System.out.println("Max Speed: 1280Kmph");
    }
}
