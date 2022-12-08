// Написать метод, которому в качестве аргументов передается строка и число,
// метод должен отпечатать в консоль указанную строку, 
// указанное количество раз;


public class ex4 {
    public static void main(String[] args) {
        printWordNTimes("Felix", 3);
    }

    public static void printWordNTimes(String str, int n){
        for (int i = 1; i <= n; i++){
            System.out.println("[" + i + "]" + str);
        }
    }
}
