public class lesson7 {
    public static void main(String[] args) {
        int programmer = 10;
        if (programmer == 1) {
            System.out.println(programmer + " программист");
        } else if (programmer > 1 && programmer <= 4) {
            System.out.println(programmer + " программиста");
        }
        else if  (programmer >= 5 && programmer <= 7) {
            System.out.println(programmer + " программистов");

            }
        else {
            System.out.println( "столько программистов не существует");

        }

        }

    }