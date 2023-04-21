package ConstructorRefDemo2;
// Реализация простой фабрики классов с использованием ссылки на конструктор
interface MyFunc<R, T>{
    R func(T n);
}
class MyClass<T>{
    private T val;
    MyClass(T v){
        val = v;
    }
    T getVal(){
        return val;
    }
}
class MyClass2{
    String str;
    MyClass2(String str){
        this.str = str;
    }
    String getStr(){
        return str;
    }
}
public class ConstructorRefDemo2 {
    static <R, T> R myClassFactory(MyFunc<R, T> cons, T v){
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyFunc<MyClass<Double>, Double> myFunc = MyClass<Double>::new;
        MyClass<Double> myClass = myClassFactory(myFunc, 100.1);
        System.out.println("val в myClass = " + myClass.getVal());

        MyFunc<MyClass2, String> myFunc1 = MyClass2::new;
        MyClass2 myClass2 = myClassFactory(myFunc1, "Lambda");
        System.out.println("str в myClass2 = " + myClass2.getStr());
    }
}
/*
val в myClass = 100.1
str в myClass2 = Lambda
 */