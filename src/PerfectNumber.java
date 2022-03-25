public class PerfectNumber {
    public void checkPrefectNumber(int num){
        int divisorSum=1;
        int divisor=2;
        while (divisorSum<=num) {
            System.out.println("divisor"+divisor);
            System.out.println("divisor"+divisorSum);
            if (num % (divisor) == 0) {
                divisorSum += divisor++;
                num /= divisor;
            }


            if(num == 0){
                System.out.println("this is Perfect number");
            }

//            if (num % (divisor++) == 0) {
//                divisorSum += 3;
//                num /= 3;
//            }

        }


    }
}
