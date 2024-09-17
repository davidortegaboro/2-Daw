package com.david.motos.domain.entity;

public class Moto {

    private Integer id;
    private String brand;
    private Integer horses;
    private Equipo equipo;

    public Moto(Integer id, String brand, Integer horses, Equipo equipo) {
        this.id = id;
        this.brand = brand;
        this.horses = horses;
        this.equipo = equipo;
    }

    public Moto(Integer id, String brand, Integer horses) {
        this.id = id;
        this.brand = brand;
        this.horses = horses;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getHorses() {
        return horses;
    }

    public void setHorses(Integer horses) {
        this.horses = horses;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
