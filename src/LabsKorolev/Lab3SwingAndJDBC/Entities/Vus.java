package LabsKorolev.Lab3SwingAndJDBC.Entities;

import java.util.Objects;

public class Vus {

    private int id;
    private String name;
    private String adress;

    public Vus(int id, String name, String adress) {
        super();
        this.id = id;
        this.name = name;
        this.adress = adress;
    }

    public Vus() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Vus{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vus Vus = (Vus) o;
        return id == Vus.id &&
                Objects.equals(name, Vus.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name);
    }
}
