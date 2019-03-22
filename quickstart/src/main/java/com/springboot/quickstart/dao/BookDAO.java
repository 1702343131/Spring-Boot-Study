package com.springboot.quickstart.dao;

import com.springboot.quickstart.entity.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 * 图书的DAO类
 */
@Component
public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList <>();
        books.add(new Book(1,"stringboot",88.7));
        books.add(new Book(1,"stringboot",88.7));
        books.add(new Book(1,"stringboot",88.7));
        return books;
    }
}
