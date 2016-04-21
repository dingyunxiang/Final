package entity;

/**
 * Created by dingyunxiang on 16/4/15.
 */
public class ShequEntity {
    private String id;
    private String community;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCommunity() {
        return community;
    }

    public void setCommunity(String community) {
        this.community = community;
    }

    public ShequEntity(String community, String id) {
        this.community = community;
        this.id = id;
    }

    public ShequEntity() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShequEntity that = (ShequEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (community != null ? !community.equals(that.community) : that.community != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (community != null ? community.hashCode() : 0);
        return result;
    }
}
