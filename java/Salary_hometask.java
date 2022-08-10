public class Salary_hometask {
    public static void main(String[] args) {
        double exp = 10;
        double sal = 5000;
        if (exp < 1) {
            System.out.println("extrasal =" + 0);
        }
        if (exp < 3) {
            System.out.println("extrasal_1 =" + sal * 10 / 100);
            {
                double ten_per = 10 / 100;
                double extrasal_1;
                extrasal_1 = sal * ten_per;
                if (extrasal_1 <= 4000) {
                    System.out.println("add_extrasal_1 =" + 1000);
                } if (extrasal_1 > 4000) {
                    System.out.println("add_extrasal_1 =" + 500);
                }
            }
        }
        if (exp > 3) {
            System.out.println("extrasal_2 =" + sal * 20 / 100);
            {
                double twenty_per = 20 / 100;
                double extrasal_2;
                extrasal_2 = sal * twenty_per;
                if (extrasal_2 <= 4000) {
                    System.out.println("add_extrasal_2 =" + 1000);
                } if (extrasal_2 > 4000) {
                System.out.println("add_extrasal_2 =" + 500);
            }
            }
        }
    }
}