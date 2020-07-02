package com.greenfxacademy.library_example.controller;


import com.greenfxacademy.library_example.model.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class BookController {

  private List<Book> books = new ArrayList<>();

  public BookController() {
    books.add(new Book("Cat's Cradle", "Kurt Vonnegut", 1963));
    books.add(new Book("Do Androids Dream of Electric Sheep?", "Philip K. Dick", 1968));
  }

  @GetMapping("/books")
  public String index(Model model, @RequestParam(name = "author", required = false) String author) {

    List<Book> queriedBooks;

    if (author != null) {
      queriedBooks = filterBooksByAuthor(author);
    } else {
      queriedBooks = books;
    }

    model.addAttribute("books", queriedBooks);
    return "books";
  }

  @GetMapping("/books/{bookId}")
  public String getBook(@PathVariable Integer bookId, Model model){
    Optional<Book> optionalBook = findBook(bookId);

    if(optionalBook.isPresent()){
      Book book = optionalBook.get();

      model.addAttribute("book", book);
      return "bookDetails";
    }

    return "redirect:/books";
  }


  private Optional<Book> findBook(Integer bookId){
    return books.stream()
        .filter(f -> f.getId().equals(bookId))
        .findFirst();
  }

  private List<Book> filterBooksByAuthor(String author) {
    return books.stream()
        .filter(book -> book.getAuthor().equals(author))
        .collect(Collectors.toList());
  }


}
