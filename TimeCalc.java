public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        String minutes_updated;
        String hours_updated;

        int total_minutes = (hours * 60) + minutes + minutesToAdd;
        int total_hours = total_minutes / 60;
        int hours1 = total_hours % 24;
        int minutes1 = total_minutes - (total_hours * 60);

        if (minutes1 >= 0 && minutes1 < 10) {
		minutes_updated = "0" + minutes1; }
else {
    minutes_updated = String.valueOf(minutes1); }

    if (hours1 >= 0 && hours1 < 10) {
    hours_updated = "0" + hours1; }
else {
    hours_updated = String.valueOf(hours1); }

    System.out.println(hours1 + ":" + minutes_updated);
    //System.out.println("Hours: " + hours);
    //System.out.println("Minutes: " + minutes);
    //System.out.println("Minutes to add: " + minutesToAdd);
    //System.out.println("New Hours: " + hours1);
    //System.out.println("New Minutes: " + minutes1);
    }
}