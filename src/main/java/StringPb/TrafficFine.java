package StringPb;

public class TrafficFine {
    public static void main(String[] args) {
        System.out.println(speedingFine(65,false));
    }
    public static int speedingFine(int speed, boolean isHoliday) {
        if (speed<=60&&isHoliday==false){
            return 0;
        } else if (speed>60&&speed<80&&isHoliday==false) {
            return 100;
        } else if (speed>=81&&isHoliday==false) {
            return 200;
        }else
            return 0;
    }

}
