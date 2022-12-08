// Написать метод, который определяет, является ли год високосным, и возвращает
// boolean (високосный - true, не високосный - false).
// Каждый 4-й год является високосным,
// кроме каждого 100-го, при этом каждый 400-й – високосный. .




public class ex5 {
    public static void main(String[] args) {
        System.out.println(checkLeapYear(2023));
    }

    public static boolean checkLeapYear (int year){
        if (year % 400 == 0){
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return year % 4 == 0;
        }

    }
}
