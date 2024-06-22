import java.util.*;

public  class CarRentalSystem {

   // AbstractedCar cars[] =new AbstractedCar[3];
    private final List<AbstractedCar> cars ;
public CarRentalSystem(){
    this.cars = new ArrayList<>();

}

public void addCar(AbstractedCar car){
    cars.add(car);
}
public AbstractedCar rentCar(int number ){
    AbstractedCar car = cars.get(number);
    if (!car.isRented()){
        car.rent();
        System.out.println("rented successfully");
    }
    else {
        System.out.println(car + "already rented");
    }
    return car;
}


public AbstractedCar returnCar(int number ){
    AbstractedCar car = cars.get(number);
    if(car.isRented()){
        car.returnCar();
        System.out.println("car returned ");
    }
    else{
        System.out.println("mrg3tsh");
    }
    return car;
}
    public void displayAvailableCars() {
        System.out.println("Available Cars:");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println((i + 1) + ". " + cars.get(i));
        }
        System.out.println();
    }


    public void listAvailableCars() {
        System.out.println("Available cars:");
        int carNumber = 1;
        for (AbstractedCar car : cars) {
            if (!car.isRented()) {
                System.out.println(carNumber + ". " + car);
                carNumber++;
            }
        }
        if (carNumber == 1) {
            System.out.println("No cars available.");
        }
    }


   // public void addCar(AbstractedCar car){
     //   this.cars.add(car);
    //}

 //  public void returnCar(AbstractedCar car){
   //     if (car.isRented()){
     //       car.returnCar();
       // }
    //}
}
