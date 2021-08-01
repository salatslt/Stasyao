public class Lesson1 {

    public static void main(String[] args) {
        int a = -10;
        if (a > 0 && a <=9) {
            System.out.println(a + " Положительное однозначное число");
        }
        else if (a >=10 && a < 100) {
            System.out.println(a + " Положительное двузначное число");
        }
        else if (a <= -100 && a >= -999) {
            System.out.println(a + " Отрицательное трехзначное число");
        }
        else if (a < 0 && a >= -9) {
            System.out.println(a + "Отрицательное однозначное число");

        }
        else if (a <= -10 && a >= -99) {
            System.out.println(a + "Отрицательное двузначное число");
        }

        else if (a <= -10000 && a >= -99999) {
            System.out.println(a + "Отрицательное пятизначное число");
        }


    }


        }