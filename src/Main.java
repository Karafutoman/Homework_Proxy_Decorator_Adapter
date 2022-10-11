public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculator();
        System.out.println(intsCalc.sum(3, 3));
        System.out.println(intsCalc.sum(15, 17));
        System.out.println(intsCalc.pow(2, 10));
        System.out.println(intsCalc.mult(5, 5));
    }


}