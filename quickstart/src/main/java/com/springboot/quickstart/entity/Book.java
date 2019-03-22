package com.springboot.quickstart.entity;

import java.awt.print.PrinterAbortException;

/**
 * Created by 张文旭 on 2019/3/18.
 */
public class Book {
    private Integer id;
    private String name;
    private Double pice;

    public  Book(){}
    public Book(Integer id, String name, Double pice) {
        this.id = id;
        this.name = name;
        this.pice = pice;
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

    public Double getPice() {
        return pice;
    }

    public void setPice(Double pice) {
        this.pice = pice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pice=" + pice +
                '}';
    }
}
