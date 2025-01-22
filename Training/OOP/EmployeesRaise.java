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


    // public void applySalaryIncrement(double YearPerformance) {
    //     if (YearPerformance > 3.80 && YearPerformance <= 5) {
    //         Salary += Salary * (YearPerformance / 100);
    //         System.out.println("Salary Incremented. New Salary: $" + Salary); }

    //         else if  (YearPerformance > 3 && YearPerformance <= 3.80) {
    //             Salary += Salary * (YearPerformance / 100);
    //             System.out.println("Salary Incremented. New Salary: $" + Salary);
    //         }
    //      else {
    //         System.out.println("NO increment for you");
    //     }
    // }
    public void evaluatePromotionAndRaise(String NewPosition, double YearPerformance, int YearsOfService) {
        if (YearPerformance > 4.85 && YearPerformance <= 5) {
            Position = NewPosition;
            System.out.println("Promotion to: " + Position);

            // Calculate raise based on years of service
            double raisePercentage;
            if (YearsOfService >= 10) {
                raisePercentage = 0.20; // 20% raise for 10+ years of service
            } else if (YearsOfService >= 5) {
                raisePercentage = 0.10; // 10% raise for 5-9 years of service
            } else {
                raisePercentage = 0.05; // 5% raise for less than 5 years of service
            }

            // Apply raise to salary
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

    System.out.println("Employee 1 Details:");
    Employee1.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 2 Details:");
    Employee2.displayEmployeeDetails();
    System.out.println();

    System.out.println("Employee 3 Details:");
    Employee3.displayEmployeeDetails();
    System.out.println();

    Employee1.evaluatePromotionAndRaise("Senior Software Engineer", 5, 3);
    Employee2.evaluatePromotionAndRaise("Senior HR Specialist", 3.92, 5);
    Employee3.evaluatePromotionAndRaise("Senior Accountant", 2, 10);


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


