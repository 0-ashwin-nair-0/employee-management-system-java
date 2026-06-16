public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1,"Ashwin Nair",25,50000.0, "Software Engineer");
        emp1.displayDetails();
        Employee emp2 = new Employee();
        emp2.setName("Madara");
        emp2.setDepartment("Software Engineer");
        emp2.setEmpid(2);
        emp2.setAge(22);
        emp2.setSalary(50000.0);
        emp2.giveBonus(40);

    }
}
