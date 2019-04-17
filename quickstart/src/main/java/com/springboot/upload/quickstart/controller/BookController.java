package com.springboot.upload.quickstart.controller;

import com.springboot.upload.quickstart.dao.BookDAO;
import com.springboot.upload.quickstart.entity.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 张文旭 on 2019/3/18.
 */
@RestController
public class BookController {
    /**
     *
     */
    //注入dao实例

    @Resource
    private BookDAO bookDAO;
    @RequestMapping(value = "/books" ,method = RequestMethod.GET)
  public List<Book> getBooks(){
        return bookDAO.getBooks();
    }
}
