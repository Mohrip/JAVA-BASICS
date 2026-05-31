package A3MonthsPlan.Section4;
import java.util.Scanner;



public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your score (0-100): ");
        int score = scanner.nextInt();

        if(score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if(score == 100) {
            System.out.println("Grade: A+ You are a genius!");
        } else if (score >= 90){
            System.out.println("Grade: A - Excellent work!");
        } else if (score >= 80) {
            System.out.println("Grade: B - Good job!");
        }  else if (score >= 70) {
            System.out.println("Grade: C - Very good!");
        }  else if (score >= 60) {
            System.out.println("Grade: D - Good job!");
        } else {
            System.out.println("Grade: F - Fail!");
        }


        int absentDays = scanner.nextInt();

        if(score >= 90 && absentDays <= 6 ) {
            System.out.println("Grade: A+ You are a genius!");
        }  else if (score >= 80 && absentDays <= 7 ) {
            System.out.println("Grade: B- Good job!");

        }  else if (score >= 70 && absentDays <= 6) {
            System.out.println("Grade: C- Very good!");
        }   else if (score >= 60 && absentDays <= 7) {
            System.out.println("Grade: D- Fail!");
        }  else {
            System.out.println("Grade: F - Fail!");
        }
        scanner.close();
    }
}
