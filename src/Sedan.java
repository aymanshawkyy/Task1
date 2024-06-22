public class Sedan extends AbstractedCar{


    Sedan(String make , String model , int year){
        super(make , model , year );
    }

    private int dailyRate = 50 ;


    @Override
    public double calculateRentalCost(int days) {
        return this.dailyRate * days;
    }

    @Override
    public String toString() {
        return make + " " + model + " (" + year + ") - Sedan";
    }
}
