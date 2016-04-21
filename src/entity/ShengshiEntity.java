package entity;

/**
 * Created by dingyunxiang on 16/4/15.
 */
public class ShengshiEntity {
    private String id;
    private String county;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public ShengshiEntity() {
    }

    public ShengshiEntity(String id, String county) {
        this.id = id;
        this.county = county;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShengshiEntity that = (ShengshiEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (county != null ? !county.equals(that.county) : that.county != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (county != null ? county.hashCode() : 0);
        return result;
    }
}
