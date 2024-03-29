public class SpeedConverter {
    public static void main(String[] args) {
        printConversion(1.5);
        printConversion(10.25);
        printConversion(-5.6);
    }
    public static long toMilesPerHour (double kilometersPerHour){
        if (kilometersPerHour > 0) {
            long mph = Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }
    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        }else{
            long miles = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + miles + "mi/h");

        }
    }
}
