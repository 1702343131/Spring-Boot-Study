package com.springboot.mybatis.quickstart.dao;

import com.springboot.mybatis.quickstart.entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@Component
public class BookDAO {
    public List<Book> getBooks(){
        List<Book> books = new ArrayList <>();
        books.add(new Book(1,"stringboot",88.5));
        books.add(new Book(1,"stringboot",88.5));
        books.add(new Book(1,"stringboot",88.5));
        return books;
    }
}
