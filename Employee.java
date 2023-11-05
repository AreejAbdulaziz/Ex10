public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public double getAnnualSalary(){

        return salary*12;
    }
    public double RaisedSalary(int amount){
salary=salary+(salary*amount)/100;
        return salary;
    }
    public void display(){
        System.out.println("Employee id: " + id + ", Name: " + name + ", Salary: " + salary + "Annual Salary "+getAnnualSalary()+"]");
    }
}
