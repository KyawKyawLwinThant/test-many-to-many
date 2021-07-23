package com.example.onetomanyunitbadperformance;

import com.example.onetomanyunitbadperformance.service.BookStoreService;
import com.example.onetomanyunitbadperformance.util.JPAUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToManyUnitBadPerformanceApplication  implements CommandLineRunner {


    private final BookStoreService bookStoreService;

    public OneToManyUnitBadPerformanceApplication(BookStoreService bookStoreService) {
        this.bookStoreService = bookStoreService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OneToManyUnitBadPerformanceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("\n Insert one author with three books");
        bookStoreService.insertAuthorWithBooks();


        JPAUtil.checkData("select * from author");
        JPAUtil.checkData("select * from book");
        JPAUtil.checkData("select * from author_book");

    }
}
