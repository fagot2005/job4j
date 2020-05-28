package encapsulation;

import java.util.Date;
import java.util.Objects;

public class License {
    private String owner;
    private String model;
    private String code;
    private Date criated;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        License license = (License) o;
        return Objects.equals(owner, license.owner) &&
                Objects.equals(model, license.model) &&
                Objects.equals(code, license.code) &&
                Objects.equals(criated, license.criated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, criated);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String oener) {
        this.owner = oener;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCriated() {
        return criated;
    }

    public void setCriated(Date criated) {
        this.criated = criated;
    }
}
