package Model;


public class Region {
    private String id;
    private String name;
    private Region parentRegion;
    private float size;

    public Region(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Region(String id, String name, Region parentRegion) {
        this.id = id;
        this.name = name;
        this.parentRegion = parentRegion;
    }

    public Region(String id, String name, Region parentRegion, float size) {
        this.id = id;
        this.name = name;
        this.parentRegion = parentRegion;
        this.size = size;
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

    public Region getParentRegion() {
        return parentRegion;
    }

    public void setParentRegion(Region parentRegion) {
        this.parentRegion = parentRegion;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }
}
