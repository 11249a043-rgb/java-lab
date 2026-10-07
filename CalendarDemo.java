import java.util.Calendar;
import java.util.GregorianCalendar;
class CalendarDemo
{
    public static void main(String args[])
    {
        Calendar c = Calendar.getInstance();
        System.out.println("Using Calendar:");
        System.out.println("Date: " + c.get(Calendar.DAY_OF_MONTH) + "/"
                + (c.get(Calendar.MONTH) + 1) + "/"
                + c.get(Calendar.YEAR));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println("\nUsing Gregorian Calendar:");
        System.out.println("Date: " + gc.get(GregorianCalendar.DAY_OF_MONTH) + "/"
                + (gc.get(GregorianCalendar.MONTH) + 1) + "/"
                + gc.get(GregorianCalendar.YEAR));
        System.out.println("Time: " + gc.get(GregorianCalendar.HOUR_OF_DAY) + ":"
                + gc.get(GregorianCalendar.MINUTE) + ":"
                + gc.get(GregorianCalendar.SECOND));
    }
}