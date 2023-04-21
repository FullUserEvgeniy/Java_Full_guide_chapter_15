package LambdaExceptionDemo;
// Генерация исключения в лямбда-выражении
interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    EmptyArrayException(){
        super("Массив пуст");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
        DoubleNumericArrayFunc average = (n) -> {
            double sum = 0;
            try {
                if (n.length == 0) throw new EmptyArrayException();
            }catch (EmptyArrayException e) {
                System.out.println(e.getMessage());
            }
            for (int i = 0; i < n.length; i++){
                sum += n[i];
            }
            return sum/n.length;
        };
        System.out.println("Среднее значение = " + average.func(values));
        System.out.println("Ошибка " + average.func(new double[0]));
    }
}
/*
Среднее значение = 3.0
Массив пуст
Ошибка NaN
 */