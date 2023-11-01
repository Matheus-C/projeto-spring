package com.matheus.custodio.projeto.resources;

import com.matheus.custodio.projeto.entities.User;
import com.matheus.custodio.projeto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserResource {
    @Autowired
    private UserService userService;
    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> users = userService.findAll();
        return ResponseEntity.ok().body(users);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findByid(@PathVariable Long id){
        User obj = userService.findByid(id);
        return ResponseEntity.ok().body(obj);
    }
}
