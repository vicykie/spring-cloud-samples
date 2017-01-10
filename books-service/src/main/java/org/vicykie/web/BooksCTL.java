package org.vicykie.web;

import org.apache.tomcat.jni.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vicykie.entities.Book;
import org.vicykie.service.BooksService;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/9/14.
 */
@RestController
@RequestMapping("/books")
public class BooksCTL {
    @Autowired
    private BooksService booksService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Book> getAll(){
       return booksService.getAll();
    }
}
