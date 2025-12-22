class NullException {
    public static void main(String[] args) {
        Exception();
        // this will cause NullPointerException
        ExceptionHandled();
        // this will handle the exception safely
    }
    static void Exception() {
        String msg = null;
        System.out.println(msg.charAt(0));  
         // causes NullPointerException
    }
    static void ExceptionHandled() {
        String msg = null;
        try {
            System.out.println(msg.charAt(0));
        } catch (NullPointerException e) {
            System.out.println("Error handled: string value is null");
        }
    }
}

