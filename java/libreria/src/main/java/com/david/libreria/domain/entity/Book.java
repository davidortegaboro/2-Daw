package com.david.libreria.domain.entity;

import lombok.Data;

@Data
public class Book {

    private Integer id;
    private Integer isbn;
    private String title_es;
    private String title_en;
    private String synopsis_es;
    private String synopsis_en;
    private double price;
    private String cover;
    private Publisher publisher;

}
