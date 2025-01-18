package com.springbootrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrest.model.Todo;
import com.springbootrest.repository.TodoService;

@RestController
@RequestMapping("/api/v1")
public class TodoController {

	private final TodoService todoService;

	@Autowired
	public TodoController(TodoService todoService) {
		this.todoService = todoService;
	}

	//Get All Todos
	@GetMapping("/todos")
	public ResponseEntity<List<Todo>> getAllTodos() {
		List<Todo> todos = todoService.getAllTodos();
		return ResponseEntity.ok().body(todos);
	}

	//Find todo by ID
	@GetMapping("/todos/{id}")
	public ResponseEntity<Todo> getTodoById(@PathVariable Long id) {
		Todo todo = todoService.getTodoById(id);
		if(todo!=null)
			return new ResponseEntity<Todo>(todo, HttpStatus.OK);
		else 
			return new ResponseEntity<Todo>(todo, HttpStatus.NOT_FOUND); 
	}

	//Create new Todo
	@PostMapping("/todos")
	public ResponseEntity<Void> createTodo(@RequestBody Todo todo) 	{
		todoService.createTodo(todo);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	//Update Todo
	@PutMapping("/todos")
	public ResponseEntity<Void> updateTodo(@RequestBody Todo todo) 	{

		Todo found = todoService.getTodoById(todo.getId());
		if(found == null) {
			return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
		}
		else 
		{
			todoService.updateTodo(todo.getId(), todo);
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
	}
	
	//Delete Todo
	@DeleteMapping("/todos/{id}")
	public ResponseEntity<String> deleteTodo(@PathVariable("id") Long id) 	
	{
		Todo found = todoService.getTodoById(id);
		if(found == null) {
			return new ResponseEntity<String>(
					"Record Does not exists", HttpStatus.NOT_FOUND);
		}
		else 
		{
			todoService.deleteTodo(id);
			return new ResponseEntity<String>(
					"Record deleted successfully", HttpStatus.OK);
		}
	}
}
