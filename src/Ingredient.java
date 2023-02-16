public class Ingredient {
    private String name;
    private String measurement;
    private double amount;

    public Ingredient(String name, String measurement, double amount) {
        this.name = name;
        this.measurement = measurement;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeasurement() {
        return measurement;
    }

    public void setMeasurement(String measurement) {
        this.measurement = measurement;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", measurement='" + measurement + '\'' +
                ", amount=" + amount +
                '}';
    }
}
