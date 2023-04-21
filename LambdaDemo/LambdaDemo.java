package LambdaDemo;

// Демонстрация исполь зования простого лямбда- выражения
interface MyNumber{
    double getValue();
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNumber = () -> 123.45;
        System.out.println("Фиксированное значение: " + myNumber.getValue());

        myNumber = () -> Math.random() * 100;
        System.out.println("Рандомное значение 1: " + myNumber.getValue());
        System.out.println("Рандомное значение 2: " + myNumber.getValue());
        System.out.println("Рандомное значение 3: " + myNumber.getValue());
    }
}
/*
Фиксированное значение: 123.45
Рандомное значение 1: 70.9334915652031
Рандомное значение 2: 20.029559312002952
Рандомное значение 3: 69.03743843027722
 */