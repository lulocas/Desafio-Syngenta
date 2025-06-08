package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Product {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("cost_per_dose")
    private double costPerDose; // Antes o nome estava diferente

    @JsonProperty("thresholds")
    private List<ProductThreshold> thresholds;


    public Product() {
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

    public List<ProductThreshold> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<ProductThreshold> thresholds) {
        this.thresholds = thresholds;
    }

    public double getCostPerDose() {
        return costPerDose;
    }

    public void setCostPerDose(float costPerDose) {
        this.costPerDose = costPerDose;
    }
}
