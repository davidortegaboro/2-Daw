package com.david.motos.domain.entity;

public class Piloto {

    private Integer id;
    private String name;
    private Integer age;

    private Equipo equipo;

    public Piloto(Integer id, String name, Integer age, Equipo equipo) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.equipo = equipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Piloto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", equipo=" + equipo +
                '}';
    }

    public Piloto(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
