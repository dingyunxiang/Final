package entity;

/**
 * Created by dingyunxiang on 16/4/15.
 */
public class PathEntity {
    private String id;
    private String pathname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPathname() {
        return pathname;
    }

    public void setPathname(String pathname) {
        this.pathname = pathname;
    }

    public PathEntity() {
    }

    public PathEntity(String id, String pathname) {
        this.id = id;
        this.pathname = pathname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PathEntity that = (PathEntity) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (pathname != null ? !pathname.equals(that.pathname) : that.pathname != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (pathname != null ? pathname.hashCode() : 0);
        return result;
    }
}
