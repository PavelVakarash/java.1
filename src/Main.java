import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apricot apricot = new Apricot(1);
        ArrayList<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(1));
        fruits.add(new Pear(1));
        System.out.println(Fruit.totalCostOfFruits);
//        System.out.println(Apple.getTotalPrice());
//        System.out.println(Pear.getTotalPrice());
        System.out.println(
                Apple.getTotalPrice() + Pear.getTotalPrice()
                        +Apricot.getTotalPrice()
        );
    }


}

//Задание 2 . Фруктовая лавка (повторение тем static,
// abstract class, abstract method)
//Создать абстрактный класс Фрукт и классы Яблоко, Груша,
// Абрикос расширяющие его.
//Класс Фрукт содержит:
//а) переменную вес,
//б) реализованный метод
// printManufacturerInfo(){System.out.print("Made in Turkey");}
//в) абстрактный метод, возвращающий стоимость фрукта,
// который должен быть переопределен в каждом классе
// наследнике. Метод должен учитывать вес фрукта.
//Создать несколько объектов разных классов.
//Подсчитать общую стоимость проданных фруктов.
//Со звездочкой*
//А также общую стоимость отдельно проданных яблок,
// отдельно груш и отдельно абрикос.