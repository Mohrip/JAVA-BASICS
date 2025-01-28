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

    
}
