import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CarRentalSystem carsystem = new CarRentalSystem() ;

        carsystem.addCar(new Sedan("Toyota","Camry", 2019));
        carsystem.addCar(new SUV("Honda","CR-V", 2020));


        System.out.println("Welcome to the Advanced Car Rental System!");


            while (true){

                carsystem.listAvailableCars();
                System.out.println("Enter the car number to rent (0 to exit): ");
                int number = input.nextInt();
                if (number == 0){
                    break;
                } else if (number == 1) {
                    AbstractedCar car = carsystem.rentCar(number);
                    carsystem.listAvailableCars();

                    System.out.println("Enter the car number to return (0 to exit): ");
                    int number2 = input.nextInt();
                    if (number2 == 1 ){
                        AbstractedCar car1 = carsystem.returnCar(number);
                    }

                }
                else{
                    System.out.println("invalid");
                }
            }

            }

        }








