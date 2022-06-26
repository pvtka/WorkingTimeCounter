package pl.coderslab.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.model.Projects;
import pl.coderslab.service.ProjectsService;

import javax.validation.Valid;
import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/projects")
public class ProjectsController {
    private final ProjectsService projectsService;

    public ProjectsController(ProjectsService projectsService) {
        this.projectsService = projectsService;
    }

    private static final Logger logger = LoggerFactory.getLogger(ProjectsController.class);

    @GetMapping("/all")
    public String showProjects(Model model) {
        List<Projects> projects = projectsService.getProject();;
        model.addAttribute("projects", projects);
        return "/projects/all";
    }


    @GetMapping("/add")
    public String newProjects(Model model) {
        model.addAttribute("projects", new Projects());
        return "/projects/add";
    }
    @PostMapping("/add")
    public String addProject(@Valid final Projects projects, final BindingResult validation){
        if (validation.hasErrors()) {
            return "/projects/add";
        }

        projectsService.addProject(projects);
        return "redirect:/projects/all";

    }


}

