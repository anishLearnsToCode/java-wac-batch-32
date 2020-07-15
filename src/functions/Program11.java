package functions;

public class Program11 {
    private static String dayFrom(int dayNumber) {
        switch (dayNumber % 7) {
            case 0: return "Sunday";
            case 1: return "Monday";
            case 2: return "Tuesday";
            case 3: return "Wednesday";
            case 4: return "Thursday";
            case 5: return "Friday";
            case 6: return "Saturday";
        }
        return null;
    }
}
