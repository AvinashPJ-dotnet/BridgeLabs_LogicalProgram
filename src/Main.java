public class Main {
    public static void main(String[] args) {
        LogicalPrograms objLogicalProgram = new LogicalPrograms();
//        objLogicalProgram.computeFibbonacci(10);
//        objLogicalProgram.checkPrefectNumber(8128);//6, 28, 496,8128
        boolean isPrime=objLogicalProgram.primeNumber(7);
        System.out.println("is prime: "+isPrime);
    }
}
