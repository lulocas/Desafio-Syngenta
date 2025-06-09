package Model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Region {
    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("parent_region_id")
    private String parentRegionId;

    @JsonProperty("size")
    private Float size;

    public Region() {
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

    public String getParentRegion() {
        return parentRegionId;
    }

    public void setParentRegion(String parentRegion) {
        this.parentRegionId = parentRegion;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
