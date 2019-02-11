package ge.ufc.inhouseProjects.controller;


import ge.ufc.inhouseProjects.entity.Project;
import ge.ufc.inhouseProjects.entity.ServiceType;
import ge.ufc.inhouseProjects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller(value = "projects")
public class ProjectController {

    @Autowired
    ProjectService service;

    @GetMapping(value = "get/all")
    public String getAllProjects(Model model){
        List<Project> projects = service.findAll();
        ServiceType type = projects.get(0).getServiceType();
        model.addAttribute("projects",service.findAll());
        return "projects";
    }

}
