// Написать метод, принимающий на вход два целых числа и проверяющий, 
// что их сумма лежит в пределах от 10 до 20 (включительно), 
// если да – вернуть true, в противном случае – false.



public class ex1 {
    public static void main(String[] args) {
        // ex1();
        System.out.println(check(11, 6) + "\n");
    }

    public static boolean check(int a, int b) {
        return a >= 10 && b <= 20;
}
}
  
