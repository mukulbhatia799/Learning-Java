import java.time.*;

public class second {
    public static void main(String[] args) {
        // LocalTime localTime = LocalTime.now();
        // System.out.println(localTime);
        // int hour = localTime.getHour();
        // int min = localTime.getMinute();
        // int sec = localTime.getSecond();
        // int nano = localTime.getNano();
        // System.out.printf("%d-%d-%d-%d", hour, min, sec, nano);

        String s = "14:23:53:234";
        int h = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[0]);
        int s = Integer.parseInt(str[0]);
        int nano = Integer.parseInt(str[0]);

        LocalTime localTime = LocalTime.of(h,m,s,nano);
    }
}