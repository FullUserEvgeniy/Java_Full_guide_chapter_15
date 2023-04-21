package LambdaDemo5;
/* Блочное лямбда-выражение, которое изменяет порядок
следования символов в строке на противоположный
плюс показано как использовать интерфейс с обобщенным типом */

interface StringRevers<T>{
    T reverse(T x);
}
public class LambdaDemo5 {
    public static void main(String[] args) {
        StringRevers<String> stringRevers;

        stringRevers = (str) -> {
            String result = "";
            for (int i = str.length() - 1; i >= 0; i--){
                result = result + str.charAt(i);
            }
            return result;
        };

        System.out.println("Результат противоположного порядка\nсимволов в строке I love Java = "
                + stringRevers.reverse("I love Java") );
    }
}
/*
Результат противоположного порядка
символов в строке I love Java = avaJ evol I
 */
