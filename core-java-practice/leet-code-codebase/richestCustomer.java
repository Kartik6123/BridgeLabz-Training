 class RichestCustomer {
    public int maximumWealth(int[][] acc) {
        int m = 0;
        for (int i = 0; i < acc.length; i++) {
            int sum = 0;//variable to store sum
            for (int j = 0; j < acc[i].length; j++) {
                sum += acc[i][j];//calculating sum of amount of money of each customer
            }
            m = Math.max(m, sum);//updating m with max of m and sum to find out the max sum out of all
        }
        return m;
    }
}