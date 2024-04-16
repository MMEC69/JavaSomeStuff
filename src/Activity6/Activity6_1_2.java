package Activity6;

public class Activity6_1_2 extends Activity6_1{
    private int EmpId;
    
    public Activity6_1_2(String EmpolyeeName, String Gen, int EmployeeID){
        super(EmpolyeeName, Gen);
        this.EmpId = EmployeeID;
    }
    
    @Override
    public void Office(){
        if(EmpId == 0){
            System.out.println("Employee Logged Out");
        }else{
            System.out.println("Employee Logged in");
        }
    }
    
    public static void main(String args[]){
        Activity6_1 employee = new Activity6_1_2("Pawan", "Male", 10826);
        
        employee.Office();
        employee.changeName("Pawan Jain");
        System.out.println(employee.toString());
        
    }

    @Override
    public void work() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
