package ge.ufc.inhouseProjects.controller;

import ge.ufc.inhouseProjects.dao.ServiceTypeDao;
import ge.ufc.inhouseProjects.entity.ServiceType;
import ge.ufc.inhouseProjects.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/types")
public class ServiceTypeController {
    @Autowired
    private ServiceTypeDao typeDao;

    @Autowired
    private ServiceTypeService service;


    @GetMapping(value = {"/", "/welcome"})
    public String getServices(Model model) {
        model.addAttribute("title", "welcome");
        model.addAttribute("message", "This is welcome page");
        ServiceType type = typeDao.findById(1L).get();
        Iterable<ServiceType> iterable = typeDao.findAll();
        List<ServiceType> types = new ArrayList<>();
        iterable.forEach(types::add);
        return "welcomePage";

    }

    @GetMapping(value = "/login")
    public String loginPage(Model model) {
        model.addAttribute("title", "loginPage");
        return "loginPage";
    }
}
