package ConstructorRefDemo;
// Демонстрация использования ссылки на конструктор
interface MyFunc<T>{
    MyClass<T> func(T n);
}

class MyClass<T>{
    private T val;
    MyClass(T n){
        val = n;
    }
    MyClass(){
        val = null;
    }
    T getVal(){
        return val;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyFunc <Integer> myFunc = MyClass <Integer>::new;
        MyClass myClass = myFunc.func(100);
        System.out.println("val = " + myClass.getVal());

        MyFunc<String> myFunc1 = MyClass::new;
        MyClass<String> myClass1 = myFunc1.func("I love Java");
        System.out.println("val = " + myClass1.getVal());
    }
}
/*
val = 100
val = I love Java
 */