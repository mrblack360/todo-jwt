package maswi.test.todojwt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import maswi.test.todojwt.models.Todo;
import maswi.test.todojwt.repositories.TodoRepository;

@RestController
@RequestMapping("/todo")
public class TodoController {
    @Autowired private TodoRepository todoRepository;

    @GetMapping
    public Iterable<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    @GetMapping(value="/{id}")
    public Optional<Todo> getTodoById(@PathVariable(value="id") long id) {
        return todoRepository.findById(id);
    }

    @PostMapping
    public Todo createTodo(@Validated @RequestBody Todo todo){
        return todoRepository.save(todo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Todo> editTodo(@Validated @RequestBody Todo todo, @PathVariable(name = "id") long id){
        Optional<Todo> todoData=todoRepository.findById(id);
        if(todoData.isPresent()){
            Todo _todo=todoData.get();
            _todo.setName(todo.getName());
            return ResponseEntity.ok(todoRepository.save(_todo));
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Todo> deleteTodo(@PathVariable(name="id") long id){
        todoRepository.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
