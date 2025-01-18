package com.springbootrest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbootrest.model.Todo;

@Service
public class TodoService {
	
	private final TodoRepository todoRepository;
	
	@Autowired
	public TodoService(TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}

	
	//select all todo record
	public List<Todo> getAllTodos() { return todoRepository.findAll(); }

	//create a new todo
	public Todo createTodo(Todo todo) { 
		return todoRepository.save(todo); 
	}
	
	//select todo object based on id
	public Todo getTodoById(Long id) { 
		return todoRepository.findById(id).get();
	}
	
	//update the todo based on id value
	public Todo updateTodo(Long id, Todo newtodo) {
		Todo found = todoRepository.findById(id).orElse(null);
		if(found != null) {
			found.setTitle(newtodo.getTitle());
			found.setDescription(newtodo.getDescription());	
			todoRepository.save(found);			
		}
		return found;
	}
	
	//delete the todo based on value
	public void deleteTodo(Long id) {todoRepository.deleteById(id); }
}
