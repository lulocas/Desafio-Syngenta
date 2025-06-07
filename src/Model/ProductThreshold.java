package Model;

public class ProductThreshold {
    private String id;
    private int minimunOccurrences;
    private float dosePerHectare;

    public ProductThreshold(String id, int minimunOccurrences, float dosePerHectare) {
        this.id = id;
        this.minimunOccurrences = minimunOccurrences;
        this.dosePerHectare = dosePerHectare;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getDosePerHectare() {
        return dosePerHectare;
    }

    public void setDosePerHectare(float dosePerHectare) {
        this.dosePerHectare = dosePerHectare;
    }

    public int getMinimunOccurrences() {
        return minimunOccurrences;
    }

    public void setMinimunOccurrences(int minimunOccurrences) {
        this.minimunOccurrences = minimunOccurrences;
    }
}
