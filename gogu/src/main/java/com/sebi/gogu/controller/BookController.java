package com.sebi.gogu.controller;

import com.sebi.gogu.entity.Book;
import com.sebi.gogu.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public String findAllBooks(Model model)
    {
        List<Book> books = bookService.findAllBooks();
        model.addAttribute("books",books);
        return "books";
    }
}
