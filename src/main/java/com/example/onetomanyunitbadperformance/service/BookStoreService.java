package com.example.onetomanyunitbadperformance.service;


import com.example.onetomanyunitbadperformance.eintity.Author;
import com.example.onetomanyunitbadperformance.eintity.Book;
import com.example.onetomanyunitbadperformance.repo.AuthorRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookStoreService {

    private final AuthorRepository authorRepository;

    public BookStoreService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }
    @Transactional
    public void insertAuthorWithBooks(){
        Author john=new Author();
        john.setName("John William");
        john.setAge(34);
        john.setGenre("History");


        Author keats=new Author();
        keats.setName("John Keats");
        keats.setAge(30);
        keats.setGenre("Poems");


        Book book1=new Book();
        book1.setIsbn("0001");
        book1.setTitle("A History of Ancient");

        Book book2=new Book();
        book2.setIsbn("00012");
        book2.setTitle("World History");

        Book book3=new Book();
        book3.setIsbn("0003");
        book3.setTitle("Second World War");



        john.getBooks().add(book1);
        book1.getAuthors().add(john);

        john.getBooks().add(book2);
        book2.getAuthors().add(john);

        keats.getBooks().add(book3);
        book3.getAuthors().add(keats);

      //  john.addBook(book1);
      //  john.addBook(book2);
       // keats.addBook(book3);

        authorRepository.save(john);
        authorRepository.save(keats);

    }


}
