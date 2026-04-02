public class DemoOperator {
    public static void main(String[] args) {

        // + - * /

        // % ( Find remainder)
        int remainder = 70 % 12;
        System.out.println(remainder); 

        System.out.println(5 % 6);

        // ++ --
        int a = 10;
        a = a + 1;
        a += 1;
        a++;
        ++a;
        System.out.println(a);

        int b = 14;
        b = b - 1;
        b -= 1;
        b--;
        --b;
        System.out.println(b);

        int c = 5;
        c = c + 2;
        c += 2;

        double hourRate = 200.75;
        int hoursPerDay = 7;
        int daysPerMonth = 22;
        double MonthlySalary = daysPerMonth * hourRate * hoursPerDay;
        System.err.println(MonthlySalary);
    
        // pre / post
        int g = 10;
        g++;
        System.out.println(g);

        //post++
        int k = g++ * 2;
        System.out.println(k); //22 ( x2 first, then assign, then ++)
        System.out.println(g);

        //pre++
        int p = 10;
        int k2 = ++p * 2;
        System.out.println(k2);
        System.out.println(p);

    }
}
