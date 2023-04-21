package LambdaDemo3;
// Демонстрация использования лямбда-выражения, принимающего два параметра
interface NumericTest2{
    boolean test(int n, int d);
}
public class LambdaDemo3 {
    public static void main(String[] args) {
        NumericTest2 numericTest2 = (n, d) -> (n % d) == 0;
        if (numericTest2.test(9, 3)) System.out.println("3 делитель 9 без остатка");
        if (!numericTest2.test(11, 4)) System.out.println("4 не является делителем 11 без остатка");
    }
}
/*
3 делитель 9 без остатка
4 не является делителем 11 без остатка
 */