package Model;

public class Product {
    private String id;
    private String name;
    private ProductThreshold[] thresholds;
    private float costPerDose;

    public Product(String id, String name, ProductThreshold[] thresholds, float costPerDose) {
        this.id = id;
        this.name = name;
        this.thresholds = thresholds;
        this.costPerDose = costPerDose;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductThreshold[] getThresholds() {
        return thresholds;
    }

    public void setThresholds(ProductThreshold[] thresholds) {
        this.thresholds = thresholds;
    }

    public float getCostPerDose() {
        return costPerDose;
    }

    public void setCostPerDose(float costPerDose) {
        this.costPerDose = costPerDose;
    }
}
