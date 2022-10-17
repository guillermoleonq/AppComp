package com.miguel.computers.comp.Repository.CrudRepository;

import com.miguel.computers.comp.Model.Computer;
import org.springframework.data.repository.CrudRepository;

public interface ComputerCrudRepository extends CrudRepository<Computer,Integer> {

}
