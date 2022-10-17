package com.miguel.computers.comp.Repository;

import com.miguel.computers.comp.Model.Message;
import com.miguel.computers.comp.Repository.CrudRepository.MessageCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.Optional;

@Repository
public class MessageRepository {
    @Autowired
    private MessageCrudRepository messageCrudRepository;

    public List<Message> getAll(){
        return (List<Message>) messageCrudRepository.findAll();
    }

    public Optional<Message> getMessages(int id){
        return messageCrudRepository.findById(id);
    }
    public Message save(Message message){
        return messageCrudRepository.save(message);
    }
    public void delete(Message message){
        messageCrudRepository.delete(message);
    }

}