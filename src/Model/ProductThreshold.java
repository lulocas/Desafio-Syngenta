package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductThreshold {
    @JsonProperty("pest_id") // Mapeia corretamente o campo do JSON
    private String pestId;

    @JsonProperty("minimum_occurrence") // Verifique o nome correto no JSON
    private int minimumOccurrences;

    @JsonProperty("dose_per_hectare") // Verifique o nome correto no JSON
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
