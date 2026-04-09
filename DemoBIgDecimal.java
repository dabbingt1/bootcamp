
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBIgDecimal {

    public static void main(String[] args) {
        // 0.1 + 0.2
        System.out.println(0.1 + 0.2);

        //solution
        //new BigDecimal("0.1")
        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("0.2");

        BigDecimal result = bd1.add(bd2);
        System.out.println(result);

        double salary = 22500.99;
        double bonus = 1500.99;
        System.out.println(salary + bonus);

        // ! 2. BigDecimal.valueOf
        BigDecimal.valueOf(22500.99).add(BigDecimal.valueOf(1500.99));

        BigDecimal result2 = BigDecimal.valueOf(22500.99).add(BigDecimal.valueOf(1500.99));
        System.out.println(result2);

        // + add
        // - subtract
        // * multiply
        // / divide
        double xtals = 150000.01;
        double spark = 90000.02;

        BigDecimal result3 = BigDecimal.valueOf(150000.01).subtract(BigDecimal.valueOf(90000.02));
        System.out.println(result3);

        //multiply (0.1*0.2) -> 0.2
        BigDecimal result4 = BigDecimal.valueOf(22500.99).multiply(BigDecimal.valueOf(1500.99));
        System.out.println(result4);

        //divide
        //1. 10/3 -> 3.333333333...
        // 2.rounding
        BigDecimal result5 = BigDecimal.valueOf(10)//
        .divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP);//Half - > 5, >5 round up, <4 round down
        System.out.println(result5);

        BigDecimal result6 = BigDecimal.valueOf(6.7)// <5 round down, >5 round up
        .divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN);
        System.out.println(result6);

        BigDecimal bd3 = BigDecimal.valueOf(10.0);
        BigDecimal bd4 = BigDecimal.valueOf(0.0);

        if (!bd4.equals(BigDecimal.valueOf(0.0))) {
            BigDecimal result7 = bd3.divide(bd4, 1, RoundingMode.HALF_DOWN);
        } else {
            System.out.println("Sorry, bd4 cannot be 0");
        }

    }
}
