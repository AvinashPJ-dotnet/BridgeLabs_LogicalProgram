import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LogicalPrograms objLogicalProgram = new LogicalPrograms();
        short ch = 0;
        System.out.printf("\n1. Fibbonacci Number\n2. Perfect Number\n3. Prime Number\n4. ReverseNumber\n5. Distinct Coupon\n6. Stop Watch\n0. Exit\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter choice: ");
        ch = in.nextShort();
        switch (ch) {
            case 1:
                objLogicalProgram.computeFibbonacci(10);
                break;
            case 2:
                objLogicalProgram.checkPrefectNumber(8128);//6, 28, 496,8128
                break;
            case 3:
                boolean isPrime = objLogicalProgram.primeNumber(7);
                System.out.println("is prime: " + isPrime);
                break;
            case 4:
                int reverseNumber = objLogicalProgram.reverseNumber(23434534);
                System.out.println("reverse number is: " + reverseNumber);
                break;
            case 5:
                objLogicalProgram.generateDistinctCouponNumber(5);
                break;
            case 6:
                objLogicalProgram.stopWatch();
                break;
            default:
                System.out.println("Please select valid choice..");
                break;
        }


    }
}
