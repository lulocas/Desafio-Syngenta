package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public class PestOccurrence {
    @JsonProperty("id")
    private String id;

    @JsonProperty("region_id")  // Corrige o nome do campo JSON
    private String regionId;

    @JsonProperty("pest_id")
    private String pestId;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("location")
    private Location location;

    public static class Location {
        private double latitude;
        private double longitude;

        public Location() {

        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }

    public PestOccurrence() {
    }


    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String region) {
        this.regionId = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPestId() {
        return pestId;
    }

    public void setPestId(String pest) {
        this.pestId = pest;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
