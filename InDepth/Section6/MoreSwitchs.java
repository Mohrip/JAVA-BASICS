package InDepth.Section6;

public class MoreSwitchs {
    
    public static void main(String[] args){

        int day =1;
        
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    //now i want to make it enhanced switch

    public static void enhancedSwitch(){
        int day =1;
        
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            default -> System.out.println("Invalid day");
        }
    }

    public static void months(){
        int month = 1;
        switch(month){
            case 1,2,3 -> System.out.println("First quarter");
            case 4,5,6 -> System.out.println("Second quarter");
            case 7,8,9 -> System.out.println("Third quarter");
            case 10,11,12 -> System.out.println("Fourth quarter");
            default -> System.out.println("Invalid month");
        }
    }

    
}
