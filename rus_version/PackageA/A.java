package packageA;

public class A {
    // Поля
    private int a = 1;
    int b = 2;            // Модификатор отсутствует(default)
    protected int c = 3;
    public int d = 4;


    public void out(){                 // Метод для доступа к данным
        System.out.println("Доступ из класса:");
        System.out.println("private: " + a);
        System.out.println("default: " + b);
        System.out.println("protected: " + c);
        System.out.println("public: " + d);
    }
}
