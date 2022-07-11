package maswi.test.todojwt.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import maswi.test.todojwt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query("FROM users WHERE name = ?1")
    List<User> findByName(String name);
}
