package ge.ufc.inhouseProjects.controller;


import ge.ufc.inhouseProjects.entity.Project;
import ge.ufc.inhouseProjects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectService service;

    @GetMapping(value = "/get/all")
    public String getAllProjects(Model model){
        List<Project> projects = service.findAll();
        model.addAttribute("projects",projects);
        return "projects";
    }

}
