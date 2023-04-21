package LambdasAsArgumentsDemo;
// Использование лямбда-выражений в качестве аргумента метода
interface StringFunc{
    String func(String string);
}
public class LambdasAsArgumentsDemo {
    public static void main(String[] args) {
        String inStr = "Lambdas add power to Java";
        String outStr;
        System.out.println("Исходная строка: " + inStr);
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка в верхнем регистре: " + outStr);

        outStr = stringOp((str) -> {
            String result = "";
            for (int i = 0; i < str.length(); i++){
                if (str.charAt(i) != ' ') result += str.charAt(i);
            }
            return result;
            }, inStr);
        System.out.println("Строка после удаления пробелов: " + outStr);
    }
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }
}
/*
Исходная строка: Lambdas add power to Java
Строка в верхнем регистре: LAMBDAS ADD POWER TO JAVA
Строка после удаления пробелов: LambdasaddpowertoJava
 */