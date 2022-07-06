package maswi.test.todojwt.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import maswi.test.todojwt.models.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo,Long>{
    
}
