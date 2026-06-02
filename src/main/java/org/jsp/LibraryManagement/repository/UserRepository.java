package org.jsp.LibraryManagement.repository;

import java.util.Optional;

import org.jsp.LibraryManagement.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer>{

	Optional<Users> findByEmail(String email);

}
