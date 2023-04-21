package LambdaDemo2;
// Демонстрация использования лямбда-выражения, принимающего параметр
interface NumericTest{
    boolean test(int n);
}
public class LambdaDemo2 {
    public static void main(String[] args) {
        NumericTest numericTest = (n) -> (n % 2) == 0;
        if (numericTest.test(10)) System.out.println("10 четное число");
        if (!numericTest.test(9)) System.out.println("9 не четное число");

        numericTest = (n) -> n >= 0;
        if (numericTest.test(9)) System.out.println("9 больше нуля");
        if (!numericTest.test(-1)) System.out.println("-1 меньше нуля");
    }
}
/*
10 четное число
9 не четное число
9 больше нуля
-1 меньше нуля
 */