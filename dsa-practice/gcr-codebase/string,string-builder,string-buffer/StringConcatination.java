class StringConcatenation {
    public static void main(String[] args) {

        String[] arr = {"Java", " ", "is", " ", "powerful"};

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
        }
        System.out.println("Concatenated string: " + sb.toString());
    }
}

