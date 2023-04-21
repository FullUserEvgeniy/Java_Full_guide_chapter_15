package MethodRefDemo;
// Демонстрация использования ссылки на статический метод
interface StringFunc{
    String func(String n);
}

class MyStringOps{
    static String strRevers(String str){
        String result = "";
        for (int i=str.length()-1; i>=0; i--) result = result + str.charAt(i);
        return result;
    }
}

public class MethodRefDemo {
    static String stringOp(StringFunc sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambda add power to Java";
        String outStr;

        outStr = stringOp(MyStringOps::strRevers,inStr);

        System.out.println(outStr);
    }
}
/*
avaJ ot rewop dda adbmaL
 */