package com.dalgim.example.sb.service;

import com.dalgim.example.sb.model.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by dalgim on 09.04.2017.
 */
@Service
public class BookServiceImpl implements BookService {

    private static List<Book> bookList = new ArrayList<>();

    static {
        bookList.add(Book.builder().id(1L).name("Harry Potter").build());
        bookList.add(Book.builder().id(2L).name("Władca Pierścienia").build());
    }

    @Override
    public Collection<Book> getAllBook() {
        return bookList;
    }
}
