package Model;

import javax.xml.stream.Location;
import java.time.LocalDateTime;

public class PestOccurrence {
    private String id;
    private Region regionId;
    private Pest pestId;
    private LocalDateTime createdAt;
    private Location location;

    public static class Location {
        private double latitude;
        private double longitude;

        public Location(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
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

    public PestOccurrence(String id, Region region, Pest pest, LocalDateTime createdAt, Location location) {
        this.id = id;
        this.regionId = region;
        this.pestId = pest;
        this.createdAt = createdAt;
        this.location = location;
    }

    public Region getRegionId() {
        return regionId;
    }

    public void setRegionId(Region region) {
        this.regionId = region;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Pest getPestId() {
        return pestId;
    }

    public void setPestId(Pest pest) {
        this.pestId = pest;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
