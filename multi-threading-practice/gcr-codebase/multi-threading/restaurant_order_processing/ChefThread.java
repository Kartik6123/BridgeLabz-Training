package restaurant_order_processing;

class ChefThread extends Thread {
    private String dishName;
    private int prepTimeSeconds; // total prep time in seconds

    public ChefThread(String name, String dishName, int prepTimeSeconds) {
        super(name);
        this.dishName = dishName;
        this.prepTimeSeconds = prepTimeSeconds;
    }

    @Override
    public void run() {
        System.out.println(getName() + " started preparing " + dishName);
        int[] progress = {25, 50, 75, 100};

        for (int p : progress) {
            try {
                // sleep proportional to remaining time
                Thread.sleep((prepTimeSeconds * 1000) / 4);
            } catch (InterruptedException e) {
                e.getMessage();
            }
            System.out.println(getName() + " preparing " + dishName + ": " + p + "% complete");
        }
    }
}

