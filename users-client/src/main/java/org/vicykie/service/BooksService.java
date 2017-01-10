package org.vicykie.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.vicykie.fallback.BooksServiceFeignFallBack;
import org.vicykie.config.feign.FeignConfig;
import org.vicykie.entities.Book;

import java.util.List;

/**
 * Created by 李朝衡 on 2016/9/20.
 */
@FeignClient(value = "books-service",configuration = FeignConfig.class,decode404 = true,fallback = BooksServiceFeignFallBack.class)
public interface BooksService {
    @RequestMapping(method = RequestMethod.GET, value = "/books")
    List<Book> getBooks();
}
