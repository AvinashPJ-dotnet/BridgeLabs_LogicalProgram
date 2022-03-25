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
        int divisor=0;
        int temp=num;
        boolean flag=false;
        do {
            divisor++;
            if ((temp % divisor) == 0) {
                divisorSum += divisor;
                if(divisorSum == num){
                    System.out.println("this is Perfect number");
                    flag=true;
                    break;
                }
            }

        }while (flag==false && divisorSum<num);
        System.out.println(flag);

    }
}
