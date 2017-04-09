package com.dalgim.example.sb.controller;

import com.dalgim.example.sb.model.Book;
import com.dalgim.example.sb.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;

/**
 * Created by dalgim on 09.04.2017.
 */
@RestController
@RequestMapping(value = "/api/book")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<Collection<Book>> allBook() {
        return new ResponseEntity<>(bookService.getAllBook(), HttpStatus.OK);
    }
}
