public class SmartDeviceDemo {

    // Interface
    interface SmartDevice {
        void turnOn();
        void turnOff();
    }

    // Light implementation
    static class Light implements SmartDevice {
        public void turnOn() {
            System.out.println("Light is turned ON");
        }

        public void turnOff() {
            System.out.println("Light is turned OFF");
        }
    }

    //  AC implementation
    static class AC implements SmartDevice {
        public void turnOn() {
            System.out.println("AC is turned ON");
        }

        public void turnOff() {
            System.out.println("AC is turned OFF");
        }
    }

    //  TV implementation
    static class TV implements SmartDevice {
        public void turnOn() {
            System.out.println("TV is turned ON");
        }

        public void turnOff() {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {

        SmartDevice light = new Light();
        SmartDevice ac = new AC();
        SmartDevice tv = new TV();

        light.turnOn();
        light.turnOff();

        ac.turnOn();
        ac.turnOff();

        tv.turnOn();
        tv.turnOff();
    }
}
