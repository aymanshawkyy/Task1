public abstract class AbstractedCar implements Rentable {
    public boolean rented = false  ;
    public String make  ;
    public String  model ;
    public int year ;


    public AbstractedCar(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public void rent() {
    if (!rented){
        rented = true ;
        System.out.println("Car rented successfully! Enjoy your ride ");
    }else {
        System.out.println("The car is already rented.");

    }}

    @Override
    public void returnCar() {
        if (rented) {
            rented = false;
            System.out.println("The car has been returned and is now available.");
        } else {
            System.out.println("The car was not rented.");
        }
    }


    @Override
    public boolean isRented() {
        return rented;
    }

    public abstract double calculateRentalCost(int days); // hst3mlha fe class bta3 el 3rbia





}

