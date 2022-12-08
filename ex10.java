public class ex10 {
    public static void main(String[] args) {
        System.out.println("\nTask 5: ");
        task5(2, 3);
    }

    public static void task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }

}

