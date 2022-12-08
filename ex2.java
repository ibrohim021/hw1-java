

// Написать метод, которому в качестве параметра передается целое число,
//  метод должен напечатать в консоль, 
//  положительное ли число передали или отрицательное.
//   Замечание: ноль считаем положительным числом.


public class ex2 {

    public static void main(String[] args) {
        checkPositiveNegative(0);
    }

    public static void checkPositiveNegative (int a) {

        System.out.println(a >= 0 ? "Positive/n" : "Negative/n");
    }
    
}