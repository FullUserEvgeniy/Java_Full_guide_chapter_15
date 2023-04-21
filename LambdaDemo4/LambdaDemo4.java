package LambdaDemo4;
// Блочное лямбда-выражение, которое вычисляет факториал значения int
interface NumericFunc{
    int Func(int n);
}
public class LambdaDemo4 {
    public static void main(String[] args) {
        NumericFunc numericFunc;

        numericFunc = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++){
                result *= i;
            }
            return result;
        };
        System.out.println("Факториал числа 10 = " + numericFunc.Func(10));
        System.out.println("Факториал числа 7 = " + numericFunc.Func(7));
        System.out.println("Факториал числа 3 = " + numericFunc.Func(3));
    }
}
/*
Факториал числа 10 = 3628800
Факториал числа 7 = 5040
Факториал числа 3 = 6
 */