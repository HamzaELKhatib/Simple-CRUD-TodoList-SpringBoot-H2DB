package com.app.todo.repository;

import com.app.todo.model.Items;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<com.app.todo.model.Items, Long> {
}
