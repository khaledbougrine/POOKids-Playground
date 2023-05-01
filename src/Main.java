import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal ch1 = new Chien("slougi");
        Chien ch2 = new Chien("canich");
        Animal oi1 = new Oiseaux("canalou");
        Oiseaux oi2 = new Oiseaux("7jal");
        List<Animal> zoo=new ArrayList<>();
        zoo.add(ch1);
        zoo.add(ch2);
        zoo.add(oi1);
        zoo.add(oi1);
        for (Animal animal:zoo) {
            System.out.println(animal.getClass().getName());
            System.out.println(animal);
        }









    }
}