import java.util.*;

public class LogicalPrograms {
    public void computeFibbonacci(int num) {
        int sum = 0;
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum + "  ");
        }
    }

    public void checkPrefectNumber(int num) {
        int divisorSum = 0;
        int divisor = 0;
        int temp = num;
        boolean flag = false;
        do {
            divisor++;
            if ((temp % divisor) == 0) {
                divisorSum += divisor;
                if (divisorSum == num) {
                    System.out.println("this is Perfect number");
                    flag = true;
                    break;
                }
            }
        } while (flag == false && divisorSum < num);
        System.out.println(flag);

    }

    public boolean primeNumber(int num) {
        int divisor = 2;
        boolean flag = true;
        if (num == 0 || num == 1)
            flag = false;
        while (divisor < (num / 2) + 1) {
            if (num % (divisor) == 0) {
                flag = false;
                break;
            }
            divisor++;
        }
        return flag;
    }

    public int reverseNumber(int number) {
        int reverseNumber = 0;
        while (number > 0) {
            int reminder = number % 10;
            reverseNumber = reverseNumber * 10 + reminder;
            number /= 10;
        }
        return reverseNumber;
    }


    public void stopWatch() {
        long start = 0;
        int ch = 0;
        do {
            double time1 = 0;
            System.out.println("1. Start watch \n2. Stop watch");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter choice:");
            ch = scanner.nextInt();
            switch (ch) {
                case 1:
                    start = System.currentTimeMillis();
                    System.out.println("Started..");
                    break;
                case 2:
                    time1 = elapsedTime(start);
                    System.out.printf("(Total seconds)\n", time1);
                    break;
                default:
                    System.out.println("Invaid choice");
                    break;
            }
        } while (ch != 2);

    }

    public double elapsedTime(long start) {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }


    //N distinct coupon number code
    public void generateDistinctCouponNumber(int number) {
        Random randNum = new Random();
        List<Integer> list = new ArrayList<>();
        int count = 0;
        while (list.size() < number) {
            count++;
            int rand = randNum.nextInt(100000) + 1;
            if (!list.contains(rand)) {
                list.add(rand);
            }
        }
        System.out.println("Distinct random numbers = " + list);
        System.out.println("count  = " + count);
    }
}
