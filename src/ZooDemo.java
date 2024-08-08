import java.util.Scanner;

public class ZooDemo {
    public static void main(String[] args) {
        System.out.println("Make the animal do stuff");
        System.out.println("Choose an animal");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        Animal animal = null;

        // SRP violation -> Fixed by Factory Design Pattern
        if(choice == 1){
            animal = new Cat();
        } else if(choice == 2){
            animal = new Peacock();
        } else if(choice == 3){
            animal = new Dog();
        } else if(choice == 4){
            animal = new Shark();
        }
        animal.breathe();
    }
}
