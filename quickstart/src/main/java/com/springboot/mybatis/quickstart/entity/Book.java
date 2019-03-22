package com.springboot.mybatis.quickstart.entity;

/**
 * Created by 张文旭 on 2019/3/18.
 */
public class Book {
    private Integer id;
    private  String name;
    private Double privce;

            public Book(){}
    public Book(Integer id, String name, Double privce) {
        this.id = id;
        this.name = name;
        this.privce = privce;
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

    public Double getPrivce() {
        return privce;
    }

    public void setPrivce(Double privce) {
        this.privce = privce;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", privce=" + privce +
                '}';
    }
}
