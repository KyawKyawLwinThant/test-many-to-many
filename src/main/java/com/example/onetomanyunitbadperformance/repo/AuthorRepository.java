package com.example.onetomanyunitbadperformance.repo;

import com.example.onetomanyunitbadperformance.eintity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {


}
