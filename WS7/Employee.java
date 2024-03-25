public class Employee {

    int id;
    String firstName;
    String lastName;
    double salary;

    Employee()
    {

    }

    Employee(int id, String fName, String lName, double sal)
    {
        this.id = id;
        firstName = fName;
        lastName = lName;
        salary = sal;
    }

    int getId()
    {
        return id;
    }
    String getFirstName()
    {
        return firstName;
    }

    String getLastName()
    {
        return lastName;
    }

    String getName()
    {
        return (firstName + " " + lastName);
    }

    double getSalary()
    {
        return salary;
    }

    void setSalary(double sal)
    {
        salary = sal;
    }

    double getAnnualSalary()
    {
        return 12 * salary;
    }

    double raiseSalary(double per)
    {
       // System.out.print("\nSalary : " + salary);
        setSalary(  (salary * (1.0 + per/100.0)  )  );
     //   System.out.print("\nSalary : " + sal);
        return (salary * (1.0 + per/100.0));
    }
    @Override
    public String toString()
    {
        return ("Employee : Id : " + id + ", Name : " + getName() + ", Salary : " + salary );
    }
    public static void main(String[] args) {
            Employee emp1 = new Employee(1, "FName 1", "LName 1", 20000);
            System.out.print("\n" + emp1.toString());
            emp1.setSalary(30000);
            System.out.print("\n Annual Salary : " + emp1.getAnnualSalary());
            //emp1.raiseSalary(5);
        System.out.print("\n New Salary after raise : " + emp1.raiseSalary(5));
    }
}
