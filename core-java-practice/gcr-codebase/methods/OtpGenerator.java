public class OtpGenerator {
    public static void main(String[] args) {
        int totalOtps = 10;
        int[] otpList = new int[totalOtps];
        // Generating OTPs and storing them in the array
        for (int index = 0; index < otpList.length; index++) {
            otpList[index] = createSixDigitOTP();
        }
        // Displaying generated OTPs
        System.out.println("Generated OTPs:");
        for (int otpValue : otpList) {
            System.out.println(otpValue);
        }
        // Checking whether all OTPs are unique
        System.out.println("All OTPs Unique: " + unique(otpList));
    }

    // Method to generate a random 6-digit OTP
    static int createSixDigitOTP() {
        int lowerLimit = 100000;
        int range = 900000;
        return lowerLimit + (int) (Math.random() * range);
    }

    // Method to check if all OTP values are unique
    static boolean unique(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

