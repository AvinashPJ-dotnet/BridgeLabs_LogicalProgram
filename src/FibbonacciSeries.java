public class FibbonacciSeries {
    public void computeFibbonacci(int num){
        int sum=0;
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        for (int i = 2; i < num; i++) {
            sum=a+b;
            a=b;
            b=sum;
            System.out.print(" "+sum);
        }
    }
}
