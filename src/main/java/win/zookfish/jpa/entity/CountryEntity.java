package win.zookfish.jpa.entity;

import javax.persistence.*;

@Entity
@Table(name = "country", schema = "mybatis_spring", catalog = "")
public class CountryEntity {
    private int id;
    private String countryname;
    private String countrycode;

    @Id
    @Column(name = "Id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "countryname", nullable = true, length = 255)
    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    @Basic
    @Column(name = "countrycode", nullable = true, length = 255)
    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (id != that.id) return false;
        if (countryname != null ? !countryname.equals(that.countryname) : that.countryname != null) return false;
        if (countrycode != null ? !countrycode.equals(that.countrycode) : that.countrycode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (countryname != null ? countryname.hashCode() : 0);
        result = 31 * result + (countrycode != null ? countrycode.hashCode() : 0);
        return result;
    }
}
