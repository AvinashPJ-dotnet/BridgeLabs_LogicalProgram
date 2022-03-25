public class LogicalPrograms {
    public void computeFibbonacci(int num){
        int sum=0;
        int a=0;
        int b=1;
        System.out.print(a+" "+b+" ");
        for (int i = 2; i < num; i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(sum+"  ");
        }
    }

    public void checkPrefectNumber(int num){
        int divisorSum=0;
        double divisor=0;
        double temp=num;
        boolean flag=false;
        do {
            divisor++;
            if ((temp % divisor) == 0) {
//                temp /= divisor;
                divisorSum += divisor;
                if(divisorSum == num){
                    System.out.println("this is Perfect number");
                    flag=true;
                    break;
                }
            }



//            if (num % (divisor++) == 0) {
//                divisorSum += 3;
//                num /= 3;
//            }

        }while (flag==false && divisorSum<num);
        System.out.println(flag);

    }
}
