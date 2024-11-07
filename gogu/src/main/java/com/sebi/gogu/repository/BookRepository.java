package com.sebi.gogu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sebi.gogu.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {

}
