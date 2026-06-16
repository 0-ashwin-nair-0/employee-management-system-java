public class Employee {

    private int empid;
    private String name;
    private int age;
    private double salary;
    private String department;

   public Employee(){
        empid = 0;
        name = "Unknown";
        age = 18;
        salary = 0.0;
        department = "Unknown";
    }

   public Employee(int empid, String name, int age, double salary, String department){
       setEmpid(empid);
       setDepartment(department);
       setName(name);
       setAge(age);
       setSalary(salary);
   }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
       if(department != null && !department.trim().isEmpty()){
        this.department = department;
       }
       else{
           this.department = "Unknown";
           throw new IllegalArgumentException("Department cannot be null or empty.\nSetting to Unknown");
       }
    }

    public String getName() {
        return name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        if (empid > 0) {
            this.empid = empid;
        } else {
            this.empid = 0;
            throw new IllegalArgumentException("Employee ID cannot be 0!\nSetting to 0");
        }
    }
    public void setName(String name) {
        if(name != null && !name.trim().isEmpty()){
        this.name = name;
    }
        else{
            this.name = "Unknown";
            throw new IllegalArgumentException("Name should not be empty\nSetting name to unknown");

        }
   }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>18 && age <=60) {
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("You are not eligible to work.");
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
       if(salary >= 0){
        this.salary = salary;
     }
       else{
           this.salary = 0;
           throw new IllegalArgumentException("Salary cannot be negative\nSetting salary to 0");
       }

   }

   public double calculateSalary()
   {
       return this.salary*12;
   }

   public void giveBonus(double percentage){
       if(percentage > 0)
       {
           double raiseAmount = this.salary * (percentage/100);
           this.salary = this.salary + raiseAmount;
           System.out.println(getName()+" you received a raise of "+percentage+" %");
           System.out.println("Monthly Salary after the raise: "+getSalary());
           System.out.println("Annual Salary after the raise: "+calculateSalary());
       }
       else{
           System.out.println("Raise percentage must be positive");
       }
   }

   public void displayDetails(){
       System.out.println("Employee Details");
       System.out.println("Employee Name: "+getName());
       System.out.println("Employee Age: "+getAge());
       System.out.println("Employee Department: "+getDepartment());
       System.out.println("Employee Monthly Salary: "+getSalary());
       System.out.println("Employee Annual Salary: "+calculateSalary());
   }
}
