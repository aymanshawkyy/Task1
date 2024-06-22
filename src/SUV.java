public class SUV extends AbstractedCar{

    public SUV(String make, String model , int year){
        super(make, model, year);
    }
    private int  dailyRate = 100;

    @Override
    public double calculateRentalCost(int days) {
        return this.dailyRate * days ;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ") - SUV";
    }
}

