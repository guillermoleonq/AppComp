package com.miguel.computers.comp.Repository.CrudRepository;

import org.springframework.data.repository.CrudRepository;
import com.miguel.computers.comp.Model.Message;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}