package maswi.test.todojwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import maswi.test.todojwt.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
