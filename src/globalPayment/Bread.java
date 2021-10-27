package globalPayment;

public class Bread extends Food{
    public String type;

    public Bread(double protins, double fats, double carbs) {
        super();
        this.protins = protins;
        this.fats = fats;
        this.carbs = carbs;
    }

    @Override
    void getMarcoNutrients() {
        
    }
}
