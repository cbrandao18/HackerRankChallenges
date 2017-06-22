/**
 * Convert 12-hour AM/PM format to military time
 * Created by Christie on 6/22/2017.
 */
public class TimeConversion {

    private static String timeConversion(String s) {
        String str = s.substring(0,2);
        int hour = Integer.parseInt(str);
        String military = "";
        if (s.charAt(8) == 'A' && hour == 12){
            military = "00" + s.substring(2,8);
        } else if (s.charAt(8) == 'A'){
            military = s.substring(0,8);
        } else {
            hour += 12;
            military = String.valueOf(hour) + s.substring(2,8);
        }
        return military;
    }

    public static void main(String[] args) {
        String ret = timeConversion("04:59:59PM");
        System.out.println(ret);
    }
}
