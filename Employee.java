public class Employee {
    private double salary;
    private String name;

    public Employee (String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    public String getName(){
        return name;
    }
    public double  getSalary(){
        return salary;

    }

    public static void main(String []args){
        Employee e1=new Employee("durjoy",2000);
         System.out.println("name is"+e1.getName());
        System.out.println("salaryis"+e1.getSalary());

    }
}
