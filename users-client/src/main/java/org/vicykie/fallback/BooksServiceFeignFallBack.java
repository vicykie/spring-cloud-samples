package org.vicykie.fallback;

import org.springframework.stereotype.Component;
import org.vicykie.entities.Book;
import org.vicykie.service.BooksService;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/8/22.
 */
@Component
public class BooksServiceFeignFallBack implements BooksService {
    @Override
    public List<Book> getBooks() {
        return null;
    }
}
