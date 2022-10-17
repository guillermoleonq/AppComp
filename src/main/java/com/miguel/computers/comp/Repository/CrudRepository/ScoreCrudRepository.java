package com.miguel.computers.comp.Repository.CrudRepository;

import com.miguel.computers.comp.Model.Score;
import org.springframework.data.repository.CrudRepository;

public interface ScoreCrudRepository extends CrudRepository<Score,Integer> {
}