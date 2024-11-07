package com.sebi.gogu;

import com.sebi.gogu.entity.Author;
import com.sebi.gogu.entity.Book;
import com.sebi.gogu.entity.Category;
import com.sebi.gogu.entity.Publisher;
import com.sebi.gogu.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GoguApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoguApplication.class, args);


	}

	@Bean
	public CommandLineRunner initialCreate(BookService bookService){
		return(args) ->{
			Book book1 = new Book("ABC","BOOK NAME", "MY FIRST BOOK");
			Author author1 = new Author("Test name1", "Test description");
			Category category1 = new Category("Business books");
			Publisher publisher1 = new Publisher("First Publisher");
			book1.addAuthor(author1);
			book1.addCategory(category1);
			book1.addPublisher(publisher1);
			bookService.createBook(book1);

			Book book2 = new Book("ABC","BOOK NAME", "MY Second BOOK");
			Author author2 = new Author("Test name1", "Test description");
			Category category2 = new Category("Business books");
			Publisher publisher2 = new Publisher("SEcond Publisher");
			book2.addAuthor(author2);
			book2.addCategory(category2);
			book2.addPublisher(publisher2);
			bookService.createBook(book2);
		};
	}


}
