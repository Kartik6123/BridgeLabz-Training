class CompareString {
    public static void main(String[] args) {
        int n = 1000000;
        // StringBuilder Test
        long start1 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("hello");
        }
        long end1 = System.nanoTime();
        long builderTime = end1 - start1;
        // StringBuffer Test
        long start2 = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbf.append("hello");
        }
        long end2 = System.nanoTime();
        long bufferTime = end2 - start2;
        System.out.println("StringBuilder Time: " + builderTime + " ns");
        System.out.println("StringBuffer Time: " + bufferTime + " ns");
    }
}

