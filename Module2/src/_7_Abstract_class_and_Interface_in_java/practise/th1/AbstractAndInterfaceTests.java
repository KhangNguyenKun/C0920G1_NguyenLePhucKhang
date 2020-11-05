package _7_Abstract_class_and_Interface_in_java.practise.th1;

import _7_Abstract_class_and_Interface_in_java.practise.th1.Animal;
import _7_Abstract_class_and_Interface_in_java.practise.th1.Chicken;
import _7_Abstract_class_and_Interface_in_java.practise.th1.Tiger;
import _7_Abstract_class_and_Interface_in_java.practise.edible.Edible;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
