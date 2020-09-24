package com.kodilla.hibernate.task0.dao;

import com.kodilla.hibernate.task0.Task0;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
@Transactional
@Repository
public interface Task0Dao extends CrudRepository<Task0, Integer> {
    List<Task0> findByDuration(int duration);

}