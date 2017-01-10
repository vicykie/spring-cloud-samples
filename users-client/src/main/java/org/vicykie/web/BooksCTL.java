package org.vicykie.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.vicykie.entities.Book;
import org.vicykie.entities.User;
import org.vicykie.service.BooksService;
import org.vicykie.service.UsersService;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/9/20.
 */
@RestController
@RequestMapping("/books")
public class BooksCTL {
    @Autowired
    private BooksService booksService;
    @RequestMapping("")
    public List<Book> getUsers(){
        return booksService.getBooks();
    }
}
