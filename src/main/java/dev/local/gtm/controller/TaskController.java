package dev.local.gtm.controller;

import dev.local.gtm.bean.Task;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TaskController {
    @RequestMapping("/tasks")
    public List<Task> getAllTasks(){
        List<Task> tasks = new ArrayList<>();
        Task task1 = new Task();
        task1.setCompleted(false);
        task1.setId("1");
        task1.setDesc("learning spring");
        Task task2 = new Task();
        task2.setId("2");
        task2.setCompleted(true);
        task2.setDesc("learning java");
        tasks.add(task1);
        tasks.add(task2);
        Task task3 = new Task();
        task3.setId("3");
        task3.setDesc("first docker backend");
        task3.setCompleted(true);
        tasks.add(task3);
        return tasks;


    }
}
