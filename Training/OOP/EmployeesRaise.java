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


    
    public void evaluatePromotionAndRaise(String NewPosition, double YearPerformance, int YearsOfService) {
        if (YearPerformance > 4.85 && YearsOfService >= 10  ) {
            Position = NewPosition;
            System.out.println("Promotion to: " + Position);

            double raisePercentage;
            if (YearsOfService >= 10) {
                raisePercentage = 0.20; 
            } else if (YearsOfService >= 2 && YearPerformance >= 4.5) {
                raisePercentage = 0.14; 
            } else {
                raisePercentage = 0.05; 
            }

            Salary += Salary * raisePercentage;
            System.out.println("New Salary after raise: SAR" + Salary);
        } else {
            System.out.println("No promotion. Performance rating too low.");
        }
    }
}




public static void main(String[] args) {
    CompanyInfo Employee1 = new CompanyInfo("IT", "Assosciate Software Engineer", "Riyadh", "Ahmed", 5000, "Mohammed", 1234);
    CompanyInfo Employee2 = new CompanyInfo("HR", "HR Specialist", "Jeddah", "Q", 3000, "Ahmed", 5678);
    CompanyInfo Employee3 = new CompanyInfo("Finance", "Assosciate", "Riyadh", "Khalid", 15000,"Ali", 452);
    CompanyInfo Employee4 = new CompanyInfo("IT", "Assosciate Software Engineer", "Riyadh", "Ahmed", 6000, "Mohammed", 12345);

    System.out.println("Employee 1 Details:");
    Employee1.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 2 Details:");
    Employee2.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 3 Details:");
    Employee3.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 4 Details:");
    Employee4.displayEmployeeDetails();
    System.out.println();

    Employee1.evaluatePromotionAndRaise("Senior Software Engineer", 5, 6);
    Employee2.evaluatePromotionAndRaise("Senior HR Specialist", 4., 5);
    Employee3.evaluatePromotionAndRaise("Senior Accountant", 2, 7);
    Employee4.evaluatePromotionAndRaise("Senior Software Engineer", 5, 10);


    System.out.println();
    System.out.println("Employee 1 Details After Increment:");
    Employee1.displayEmployeeDetails();

    System.out.println();
    System.out.println("Employee 2 Details After Increment:");
    Employee2.displayEmployeeDetails();

    System.out.println();
    System.out.println("Employee 3 Details After Increment:");
    Employee3.displayEmployeeDetails();

    System.out.println();
    System.out.println("Employee 4 Details After Increment:");
    Employee4.displayEmployeeDetails();





}    

    }


