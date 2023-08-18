public class D extends A {   // Метод для доступа к данным
    public void out(){
        A obj = new A();
        System.out.println("Доступ из класса потомка, который находится в другом пакете:");
        System.out.println("protected: " + super.c);   // super дает доступ к переменной уровня доступа protected класс родителя
        System.out.println("public: " + obj.d);
    }
}
