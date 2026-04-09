public class DemoMath {
    public static void main(String[] args) {
        // ! pI
        double p1 = Math.PI;
        //circle area
        double radius = 3.5;
        double area = radius * radius  * Math.PI;
        System.out.println(area);

        // ! round
        System.out.println(Math.round(10.453));
        System.out.println(Math.round(10.543));

        // ! sqrt
        System.out.println(Math.sqrt(9));
        System.out.println(Math.sqrt(81));

        // ! pow
        double result = Math.pow(2, 3); // implicit promotion
        System.out.println(result);

        double bmi = 76/ Math.pow(1.76, 2);
        System.out.println(bmi);

        // ! abs
        int x = -2; // 2 / -2
        if ( x < 0) {
            x = x * -1;
        }
        System.out.println(x);

        int y = -3;
        System.out.println(Math.abs(y));

        // ! max, min
        int[] arr = new int[] {10, 4, 8, 99, -2};
        //find max
        int max = arr[0];
        int min = arr[0];
        for ( int i = 0; i < arr.length; i++){
            //if (arr[i] > max){ }
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        System.out.println(max);
        System.out.println(min);

        // ! floor, ceil
        System.out.println(Math.ceil(bmi));
        System.out.println(Math.floor(bmi));

        // random

        //assignment
        //1 - 49 (random)
        //output: int[] -> 6 numbers (marksix) (no duplicate)
    }
}
