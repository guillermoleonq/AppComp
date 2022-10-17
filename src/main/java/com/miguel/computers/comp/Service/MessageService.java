package com.miguel.computers.comp.Service;


import com.miguel.computers.comp.Model.Message;
import com.miguel.computers.comp.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll() {
        return messageRepository.getAll();
    }

    public Optional<Message> getMessage(int id) {
        return messageRepository.getMessages(id);
    }

    public Message save(Message message) {
        if (message.getIdMessage() == null) {
            return messageRepository.save(message);
        } else {
            Optional<Message> messageEncontrado = messageRepository.getMessages(message.getIdMessage());
            if (messageEncontrado.isPresent()) {
                return message;
            } else {
                return messageRepository.save(message);
            }
        }
    }

    public Message update(Message message) {
        if (message.getIdMessage() != null) {
            Optional<Message> messageEncontrado = getMessage(message.getIdMessage());
            if (!messageEncontrado.isEmpty()){
                if (message.getMessageText() != null) {
                    messageEncontrado.get().setMessageText(message.getMessageText());
                }
                return messageRepository.save(messageEncontrado.get());
            }
        }
        return message;
    }

    public boolean delete(int id){
        Boolean respuesta = getMessage(id).map(elemento ->{
            messageRepository.delete(elemento);
            return true;
        }).orElse(false);
        return respuesta;
    }

}

