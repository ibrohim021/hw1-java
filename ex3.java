// Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, 
// если число отрицательное, и вернуть false если положительное.




public class ex3 {
    public static void main(String[] args) {
        System.out.println(checkNegative(-3) + "\n");
    }

    public static boolean checkNegative(int a){

        return a < 0;
    }
}
