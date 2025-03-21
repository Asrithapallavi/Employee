class Employee{
    private int id;
    private String name;
    private float salary;
    private String designation;
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public float getSalary(){
        return salary;
    }
    public void setSalary(float salary){
        this.salary=salary;
     }
     public String getDesignation(){
        return designation;
     }
     public void setDesignation(String designation){
        this.designation=designation;
     }
}
public class Main{
    public static void main(String[] args) {
    Employee employee = new Employee();
    employee.setID(1);
    employee.setName("java");
    employee.setSalary(30000.98f);
    employee.setDesignation("mca");
    System.out.println("employee details");
    System.out.println("employee id"+employee.getId());
    System.out.println(employee.getName());
    System.out.println(employee.getSalary());
    System.out.println(employee.getDesignation());    
    }
}
