package level_03;
public class DayOfWeek {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java DayOfWeek <month> <day> <year>");
            System.out.println("Example: java DayOfWeek 3 26 2024");
            return;
        }

        // Parse command-line arguments
        int m = Integer.parseInt(args[0]); // month (1 to 12)
        int d = Integer.parseInt(args[1]); // day
        int y = Integer.parseInt(args[2]); // year

        // Calculate y0
        int y0 = y - (14 - m) / 12;

        // Calculate x
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;

        // Calculate mo
        int mo = m + 12 * ((14 - m) / 12) - 2;

        // Calculate do (day of week)
        int dayOfWeek = (d + x + (31 * mo) / 12) % 7;

        // Output result
        System.out.println(dayOfWeek);
    }
}
