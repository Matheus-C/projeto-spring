package com.matheus.custodio.projeto.services;

import com.matheus.custodio.projeto.entities.User;
import com.matheus.custodio.projeto.repositories.UserRepository;
import com.matheus.custodio.projeto.services.exceptions.DatabaseException;
import com.matheus.custodio.projeto.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(()-> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return userRepository.save(obj);
    }

    public void delete(Long id){
        try {
            userRepository.deleteById(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj){
        try {
            User entity = userRepository.getReferenceById(id);
            updateData(entity, obj);
            return userRepository.save(entity);
        }catch(EntityNotFoundException e){
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    private void updateData(User entity, User obj) {
        entity.setEmail(obj.getEmail());
        entity.setName(obj.getName());
        entity.setPhone(obj.getPhone());
    }
}
