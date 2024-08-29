package br.edu.ibmec.projeto.backend.task_manager.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/")

public class TaskController {
    
    private static List<Task> _Tasks = new ArrayList<>(); 
    
    @GetMapping()
    public String index(Model modelView){
        modelView.addAttribute("listatarefas", _Tasks);
        return "lista-task";
    }

    @GetMapping("/create")
    public String createTask(){
        return "lista-task";
    }
    @PostMapping("/saveTask")
    public String postMethodName(@ModelAttribute Task task){
        return "save-task";
    }
    
}
/* */