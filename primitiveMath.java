public class primitiveMath {
    public static void main(String[] args) {
        int count = 3;
        int price = 10;


        //Java: int value * int value -> int value
        //Assign int value into int variable (ok)
        int total = count*price;
        System.out.println(total);

        int totalScore = 750;
        int peopleCount = 8;

        //java : int value / int value -> int value (93)
        int average = totalScore / peopleCount;
        System.out.println(average);

        //Assign int value to double variable(ok)(93->93.0)

        double average2 = totalScore / peopleCount;
        System.out.println(average2);

        int k = 100 + 300;
        System.out.println(k);

        //Overflow
        byte b1 = -128;
        // Step 1 : byte value - int value -> int value
        System.out.println(b1 -1);

        // byte value - int value -> int value
        // I take my own risk
        b1 = (byte)(b1-1);// () due to byte - int, not due to overflow
        System.out.println(b1);//127 (overflow)

        int amount = 2100000000;
        amount = amount +100000000;
        System.out.println(amount);//overflow

        long amount1 = 2100000000;
        amount1 = amount1 +100000000L;
        System.out.println(amount1);//correct

        amount = 2_100_000_000;
        long NewAmount = amount + 100000000L;
        System.out.println(NewAmount);


    }
}
