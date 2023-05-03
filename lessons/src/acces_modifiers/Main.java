package acces_modifiers;

public class Main {

    //Java Access Modifiers (Модификаторы доступа)
    /**
     * Виды модификаторов доступа
     * 1. public - переменная/метод выдны из любого класса - есть доступ к
     * переменной/методу для любого кода в программе
     * 2. private - есть доступ только для переменных/методов, определенных в
     * том же классе. Из др. класссов напрямую доступа к ним нет
     * 3. default - переменная/метод выдны в том пакете где нах-ся класс
     * 4. protected - доступ к переменным/методам с модификатором protected,
     * есть у классов того же пакета и подклассов этого класса, нах-ся в любых
     * пакетах
     */
    public static void main(String[] args) {
        OurClass ourClass = new OurClass();
        ourClass.b = 10;
        ourClass.c = 5;
        ourClass.setA(10);
    }

}