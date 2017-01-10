package org.vicykie.service;

import org.springframework.stereotype.Service;
import org.vicykie.entities.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 李朝衡 on 2016/9/14.
 */
@Service("booksService")
public class BooksService {

    public List<Book> getAll() {
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 99; i++) {
            Book b = new Book();
            b.setName("book "+i);
            b.setAuthor("author  "+i);
            b.setPublisher("publisher "+i);
            b.setId(i);
            books.add(b);
        }
        return books;
    }
}
