package carDemoLSP;

import java.util.Scanner;

public class UserDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please choose your car");
        int carChoice = sc.nextInt();

        BasicCar car = null;
        // multiple if else is SRP violation
        if(carChoice == 1){
            car = new BasicCar();
        } else if(carChoice == 2){
            car = new AdvancedCar();
        } else if(carChoice == 3){
            car = new ElectricCar();
        }
        car.startEngine();// violating LSP
    }
}




// IntelliJ Idea Community Edition


