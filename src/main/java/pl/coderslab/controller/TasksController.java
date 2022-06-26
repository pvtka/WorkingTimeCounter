package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Projects;
import pl.coderslab.model.Tasks;
import pl.coderslab.service.ProjectsService;
import pl.coderslab.service.TasksService;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@Controller
@RequestMapping("/tasks")
public class TasksController {
    private final TasksService tasksService;

    private final ProjectsService projectsService;

    public TasksController(TasksService tasksService, ProjectsService projectsService) {
        this.tasksService = tasksService;
        this.projectsService = projectsService;
    }

    @GetMapping("/all")
    public String showTasks(Model model) {
        List<Tasks> tasks = tasksService.getTask();;
        model.addAttribute("tasks", tasks);
        return "/tasks/all";
    }

    @GetMapping("/add")
    public String newTasks(Model model) {


        List<Projects> listOfProjectsNames = projectsService.getProject();
        model.addAttribute("projects", listOfProjectsNames);
        model.addAttribute("tasks", new Tasks());
        return "/tasks/add";
    }
    @PostMapping("/add")
    public String addTask(@Valid final Tasks tasks, final BindingResult validation){
        if (validation.hasErrors()) {
            return "/tasks/add";
        }

        tasksService.addTask(tasks);
        return "redirect:/tasks/all";

    }




}
