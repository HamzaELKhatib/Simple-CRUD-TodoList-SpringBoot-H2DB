package com.app.todo.controller;

import com.app.todo.repository.TodoRepo;
import com.app.todo.model.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    @Autowired
    private TodoRepo todorepo;


    @GetMapping
    public List<Items> findAll(){
        return todorepo.findAll();
    }

    @PostMapping
    public Items save(@Valid @NotNull @RequestBody Items items){
        return todorepo.save(items);
    }


    @PutMapping
    public Items update(@Valid @NotNull @RequestBody Items items){
        return todorepo.save(items);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        todorepo.deleteById(id);
    }

}
