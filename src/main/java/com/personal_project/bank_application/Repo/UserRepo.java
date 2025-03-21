package com.personal_project.bank_application.Repo;

import com.personal_project.bank_application.User.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UserRepo extends JpaRepository<User, Long> {

    <S extends User> S save(S User);

    Optional<User> findUserByEmail(String email);

}
