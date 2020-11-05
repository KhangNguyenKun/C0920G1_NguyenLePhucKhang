package _7_Abstract_class_and_Interface_in_java.practise.th1;

 import  _7_Abstract_class_and_Interface_in_java.practise.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "chicken : cuc tac ";
    }
    @Override
    public String howToEat(){
        return "Eat too much ";
    }
}
