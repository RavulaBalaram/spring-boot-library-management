package org.jsp.LibraryManagement.repository;

import java.util.Optional;

import org.jsp.LibraryManagement.entity.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Books, Integer>{

	Optional<Books> findBookByTitle(String title);

}
