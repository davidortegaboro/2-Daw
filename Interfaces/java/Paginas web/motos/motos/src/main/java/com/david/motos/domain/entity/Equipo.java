package com.david.motos.domain.entity;

import javax.naming.InterruptedNamingException;
import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private List<Moto> listMotos;

    private String name;

    private Integer id;

    private List<Piloto> listPiloto;


    public Equipo(List<Moto> listMotos, String name, Integer id, List<Piloto> listPiloto) {
        this.listMotos = listMotos;
        this.name = name;
        this.id = id;
        this.listPiloto = listPiloto;
    }

    public List<Moto> getListMotos() {
        return listMotos;
    }

    public void setListMotos(List<Moto> listMotos) {
        this.listMotos = listMotos;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Piloto> getListPiloto() {
        return listPiloto;
    }

    public void setListPiloto(List<Piloto> listPiloto) {
        this.listPiloto = listPiloto;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "listMotos=" + listMotos +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", listPiloto=" + listPiloto +
                '}';
    }
}
