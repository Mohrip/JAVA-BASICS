package A3MonthsPlan.Section5;

public class convertToCentimeters {

    public static void main(String[] args) {}
        public static double convertToCentimeters ( int inches){
            if (inches < 0) {
                return -1;
            }
            return inches * 2.54;

        }

        public static double convertToCentimeters ( int height, int feet){
            if (height < 0 || feet < 0) {
                return -1;
            }
            return height * feet;
        }

}
