package A3MonthsPlan.Section5;

public class JavaMethods {



    // TYPE 1: Takes input, returns output
    public static long toMilesPerHour(double kmh) {
        return Math.round(kmh / 1.609);
    }
// Usage: long result = toMilesPerHour(100);

    // TYPE 2: Takes input, returns nothing (void)
    public static void printConversion(double kmh) {
        System.out.println(kmh + " km/h");
    }
// Usage: printConversion(100);

    // TYPE 3: Takes nothing, returns output
    public static double getPi() {
        return 3.14159;
    }
// Usage: double pi = getPi();

    // TYPE 4: Takes nothing, returns nothing
    public static void sayHello() {
        System.out.println("Hello!");
    }
// Usage: sayHello();




    // 2. OVERLOADING — Same Name, Different Parameters

    /* Same method name but with different inputs.
     Java picks the right one based on what you pass.
Think of it like a coffee machine: one button,
but it makes different drinks based on what you put in. */

    public class SpeedConverter {

        // Version 1: convert one value
        public static double toMiles(double kmh) {
            return Math.round(kmh / 1.609);
        }

        // Version 2: convert one value with custom precision
        public static double toMiles(double kmh, int decimalPlaces) {
            double factor = Math.pow(10, decimalPlaces);
            return Math.round((kmh / 1.609) * factor) / factor;
        }

        // Version 3: convert an array of values
        public static double[] toMiles(double[] kmhArray) {
            double[] result = new double[kmhArray.length];
            for (int i = 0; i < kmhArray.length; i++) {
                result[i] = Math.round(kmhArray[i] / 1.609);
            }
            return result;
        }

        // Version 4: different parameter TYPE (int instead of double)
        public static long toMiles(int kmh) {
            return Math.round(kmh / 1.609);
        }

        public static void main(String[] args) {
            // Java automatically picks the RIGHT version based on arguments:
            toMiles(100.0);              // → calls Version 1 (one double)
            toMiles(100.0, 2);           // → calls Version 2 (double + int)
            toMiles(new double[]{60, 80}); // → calls Version 3 (array)
            toMiles(100);                // → calls Version 4 (one int)
        }
    }

    /*
    *
OVERLOADING = same class, same name, DIFFERENT parameters
              "Hey toMiles(), I'm giving you different inputs"

OVERRIDING  = child class, same name, SAME parameters
              "Hey Dad, I'll do describe() MY way"

super       = "call my parent's version"
@Override   = "I'm replacing my parent's method" (safety check)
    *  */


    // Static is used to With static — Call directly, NO object needed


}
