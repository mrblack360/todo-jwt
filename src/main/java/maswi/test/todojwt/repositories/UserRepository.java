package maswi.test.todojwt.repositories;

import java.util.List;

// import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import maswi.test.todojwt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    // @Query(value="select * FROM users WHERE name = ?1",nativeQuery = true)
    List<User> findUserByName(String name);
}
