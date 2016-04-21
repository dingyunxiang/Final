package entity;

/**
 * Created by dingyunxiang on 16/4/15.
 */
public class JiedaoEntity {
    private String id;
    private String street;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public JiedaoEntity() {
    }

    public JiedaoEntity(String id, String street) {
        this.id = id;
        this.street = street;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        JiedaoEntity that = (JiedaoEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        return result;
    }
}
