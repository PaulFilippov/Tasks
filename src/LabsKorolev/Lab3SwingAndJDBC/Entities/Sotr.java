package LabsKorolev.Lab3SwingAndJDBC.Entities;

import java.util.Objects;

public class Sotr {

    private int id;
    private int idVus;
    private String name;
    private String phone;

    public Sotr(int id, int idVus, String name, String phone) {
        super();
        this.id = id;
        this.idVus = idVus;
        this.name = name;
        this.phone = phone;
    }

    public Sotr() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdVus() {
        return idVus;
    }

    public void setIdVus(int idVus) {
        this.idVus = idVus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Sotr{" +
                "id=" + id +
                ", idVus=" + idVus +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sotr sotr = (Sotr) o;
        return id == sotr.id &&
                idVus == sotr.idVus &&
                Objects.equals(phone, sotr.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, idVus, phone);
    }
}
