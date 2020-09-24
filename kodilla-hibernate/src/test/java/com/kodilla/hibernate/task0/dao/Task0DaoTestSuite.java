package com.kodilla.hibernate.task0.dao;

import com.kodilla.hibernate.task0.Task0;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest

public class Task0DaoTestSuite {
    @Autowired
    private Task0Dao task0Dao;
    private static final String DESCRIPTION = "Test moduł 17.2: Learn Hibernate";

    @Test
    public void testTask0DaoSave() {
        //Given
        Task0 task = new Task0(DESCRIPTION, 7);

        //When
        task0Dao.save(task);

        //Then
        int id = task.getId();
        Optional<Task0> readTask0 = task0Dao.findById(id);
        Assert.assertTrue(readTask0.isPresent());

        //CleanUp
        task0Dao.deleteById(id);
    }
}


