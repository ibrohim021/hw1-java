// Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
// С помощью цикла и условия заменить 0 на 1, 1 на 0;



public class ex6 {
    public static void main(String[] args) {
        int[] replaceValues = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0}; 

        System.out.println("Task 1: ");
        task1(replaceValues);
    }

    public static void task1(int[] replaceValues) {
        for (int i = 0; i < replaceValues.length; i++) {
            replaceValues[i] = (replaceValues[i] > 0)? 0 : 1;
            System.out.print(replaceValues[i] + " ");
        }
    }
}
