package labsKorolev.Lab3SwingAndJDBC.Entities;

import java.util.Objects;

public class Spec {

    private int id;
    private int idvus;
    private String name;
    private String info;

    public Spec(int id, int idvus, String name, String info) {
        super();
        this.id = id;
        this.idvus = idvus;
        this.name = name;
        this.info = info;
    }

    public Spec() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getidvus() {
        return idvus;
    }

    public void setidvus(int idvus) {
        this.idvus = idvus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Spec{" +
                "id=" + id +
                ", idvus=" + idvus +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spec Spec = (Spec) o;
        return id == Spec.id &&
                idvus == Spec.idvus;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idvus);
    }
}
