package problemaII;

import java.util.Objects;

public class Automobil {
    private String marca;
    private String model;
    private int capacitate;
    private double pret;

    public Automobil(String marca, String model, int capacitate, double pret) {
        this.marca = marca;
        this.model = model;
        this.capacitate = capacitate;
        this.pret = pret;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Automobil automobil = (Automobil) o;
        return capacitate == automobil.capacitate && Double.compare(automobil.pret, pret) == 0 && Objects.equals(marca, automobil.marca) && Objects.equals(model, automobil.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, model, capacitate, pret);
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "marca='" + marca + '\'' +
                ", model='" + model + '\'' +
                ", capacitate=" + capacitate +
                ", pret=" + pret +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacitate() {
        return capacitate;
    }

    public void setCapacitate(int capacitate) {
        this.capacitate = capacitate;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

}
