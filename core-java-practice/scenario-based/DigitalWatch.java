public class DigitalWatch {
    public static void main(String[] args) {
        for (int h = 0; h < 24; h++) {
            // hours from 0 to 23

            for (int m = 0; m < 60; m++) {
                // minutes from 0 to 59
                if (h == 13 && m == 0) {
                    System.out.println("Power cut! Watch stopped at 13:00");
                    break;
                }
                System.out.println(h+"hours" + ":" + m + "minutes");
                // display time
            }
            if (h == 13) {
                break;
            }
        }
    }
}
