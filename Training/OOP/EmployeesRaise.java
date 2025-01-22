package Training.OOP;

// this is another file to practice classes and objects 


public class EmployeesRaise {

    public static class CompanyInfo {
        private String Department;
        private String Position;
        private String Location;
        private String LineManager;
        private int Salary;
        private String EmployeeName;
        private int EmployeeID;
    

    public CompanyInfo (String Department, String Position, String Location, String LineManager, int Salary, String EmployeeName, int EmployeeID) {
        this.Department = Department;
        this.Position = Position;
        this.Location = Location;
        this.LineManager = LineManager;
        this.Salary = Salary;
        this.EmployeeName = EmployeeName;
        this.EmployeeID = EmployeeID;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + EmployeeName);
        System.out.println("Employee ID: " + EmployeeID);
        System.out.println("Department: " + Department);
        System.out.println("Position: " + Position);
        System.out.println("Location: " + Location);
        System.out.println("Line Manager: " + LineManager);
        System.out.println("Salary: SAR" + Salary);

    }


    public void applySalaryIncrement(double YearPerformance) {
        if (YearPerformance > 3.80 && YearPerformance <= 5) {
            Salary += Salary * (YearPerformance / 100);
            System.out.println("Salary Incremented. New Salary: $" + Salary); }

            else if  (YearPerformance > 3 && YearPerformance <= 3.80) {
                Salary += Salary * (YearPerformance / 100);
                System.out.println("Salary Incremented. New Salary: $" + Salary);
            }
         else {
            System.out.println("NO increment for you");
        }
            

    }}

public static void main(String[] args) {
    CompanyInfo Employee1 = new CompanyInfo("IT", "Software Developer", "Riyadh", "Ahmed", 5000, "Ali", 1234);
    CompanyInfo Employee2 = new CompanyInfo("HR", "HR Specialist", "Jeddah", "Q", 3000, "Ahmed", 5678);
    CompanyInfo Employee3 = new CompanyInfo("Finance", "Assosciate", "Riyadh", "Khalid", 15000,"Mohammed", 452);

    System.out.println("Employee 1 Details:");
    Employee1.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 2 Details:");
    Employee2.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 3 Details:");
    Employee3.displayEmployeeDetails();
    System.out.println();

    Employee1.applySalaryIncrement(2.5);
    Employee2.applySalaryIncrement(3.92);
    Employee3.applySalaryIncrement(5);


    System.out.println();
    System.out.println("Employee 1 Details After Increment:");
    Employee1.displayEmployeeDetails();

    System.out.println();
    System.out.println("Employee 2 Details After Increment:");
    Employee2.displayEmployeeDetails();

    System.out.println();
    System.out.println("Employee 3 Details After Increment:");
    Employee3.displayEmployeeDetails();





}    

    }

