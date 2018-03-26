package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    TaskListDao taskListDao;
    private static final String LISTNAME = "LIST ONE";
    private static final String DESCRIPTION = "Test: Learn Hibernate task";


    @Test
    public void testSave() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        //When
        taskListDao.save(taskList);
        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(1,readTaskList.getId());
        //CleanUp
        taskListDao.delete(id);
    }

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME, DESCRIPTION);
        taskListDao.save(taskList);
        //When
        List<TaskList> readTasks = taskListDao.findByListName(LISTNAME);
        //Then
        int id = taskList.getId();
        TaskList readTaskList = taskListDao.findOne(id);
        Assert.assertEquals(1,readTaskList.getId());
        //CleanUp
        taskListDao.delete(id);
    }
}