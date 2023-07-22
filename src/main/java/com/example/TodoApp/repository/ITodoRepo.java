package com.example.TodoApp.repository;

import com.example.TodoApp.model.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepo extends CrudRepository<TodoItem,Long> {

}
