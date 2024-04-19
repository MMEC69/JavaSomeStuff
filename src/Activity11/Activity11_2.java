package Activity11;

public class Activity11_2 {
    public int add(int x, int y){
        return (x+y);
    }
    
    public double add(double d, double e, double f, double g){
        return (d+e+f+g);
    }
    
    public double add(double a, double b){
        return (a+b);
    }
    
    public static void main(String args[]){
        Activity11_2 a = new Activity11_2();
        System.out.println(a.add(25, 30));
        System.out.println(a.add(10.0, 15.0, 20.0, 25.0));
        System.out.println(a.add(127.5, 123.5));
    }
    
    
}
