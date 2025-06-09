package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductThreshold {
    @JsonProperty("pest_id")
    private String pestId;

    @JsonProperty("minimum_occurrence")
    private int minimumOccurrences;

    @JsonProperty("dose_per_hectare")
    private int dosePerHectare;

    public ProductThreshold() {
    }

    public String getId() {
        return pestId;
    }

    public void setId(String id) {
        this.pestId = id;
    }

    public float getDosePerHectare() {
        return dosePerHectare;
    }

    public void setDosePerHectare(int dosePerHectare) {
        this.dosePerHectare = dosePerHectare;
    }

    public int getMinimumOccurrences() {
        return minimumOccurrences;
    }

    public void setMinimumOccurrences(int minimumOccurrences) {
        this.minimumOccurrences = minimumOccurrences;
    }
}
