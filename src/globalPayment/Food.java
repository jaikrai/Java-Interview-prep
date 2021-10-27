package globalPayment;

abstract class Food {
    public double tastyScore;
    public String type;
    double protins;
    double fats;
    double carbs;

    public Food(double tastyScore,double protins, double fats, double carbs) {
        this.tastyScore = tastyScore;
        this.protins = protins;
        this.fats = fats;
        this.carbs = carbs;
    }

    public Food() {

    }

    abstract void getMarcoNutrients();
}
