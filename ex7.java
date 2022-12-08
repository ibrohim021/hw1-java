// Задать пустой целочисленный массив длиной 100.
// С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;



public class ex7 {
    public static void main(String[] args) {
        System.out.println("\nTask 2: ");
        task2(100);
    }

    public static void task2(int size) {
        int[] fillArr = new int[size];
        for (int i = 0; i < fillArr.length; i++) {
            fillArr[i] = i + 1;
            System.out.print(fillArr[i] + " ");
        }
    }
}
