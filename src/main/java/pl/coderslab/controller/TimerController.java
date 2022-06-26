package pl.coderslab.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.coderslab.model.Projects;
import pl.coderslab.model.Tasks;
import pl.coderslab.model.Timer;
import pl.coderslab.service.ProjectsService;
import pl.coderslab.service.TasksService;
import pl.coderslab.service.TimerService;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/time")
public class TimerController {
    private final TimerService timerService;
    private final ProjectsService projectsService;
    private final TasksService tasksService;

    public TimerController(TimerService timerService, ProjectsService projectsService, TasksService tasksService) {
        this.timerService = timerService;
        this.projectsService = projectsService;
        this.tasksService = tasksService;
    }



    @GetMapping("/all")
    public String showTasks(Model model) {
        List<Timer> time = timerService.getTime();;
        model.addAttribute("time", time);
        return "/time/all";
    }

    @GetMapping("/add")
    public String newTime(Model model) {
        List <Tasks> listOfTasksNames = tasksService.getTask();
        model.addAttribute("tasks", listOfTasksNames);

        model.addAttribute("time", new Timer());
        return "/time/add";
    }
    @PostMapping("/add")
    public String addTime(@Valid final Timer time, final BindingResult validation){
        if (validation.hasErrors()) {
            return "/time/add";
        }

        timerService.addTime(time);
        return "redirect:/time/all";

    }



}
