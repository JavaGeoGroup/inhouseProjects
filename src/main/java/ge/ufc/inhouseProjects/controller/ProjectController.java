package ge.ufc.inhouseProjects.controller;


import ge.ufc.inhouseProjects.entity.Project;
import ge.ufc.inhouseProjects.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/projects")
public class ProjectController {

    @Autowired
    ProjectService service;

    @GetMapping
    public String getAllProjects(Model model){
        List<Project> projects = service.findAll();
        model.addAttribute("projects",projects);
        model.addAttribute("selectedProject",projects.size()>0?projects.get(0):new Project());
        return "projects";
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteProjectById(@PathVariable long id,Model model){
        service.deleteProjectById(id);
        model.addAttribute("projects",service.findAll());
        return "projects";
    }
    @GetMapping(value = "/{id}/methods")
    public String getProjectMethods(@PathVariable long id,Model model){
        model.addAttribute("selectedProject",service.findById(id));
        return "projects";
    }

}
