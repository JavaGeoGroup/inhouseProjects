package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.dao.ProjectDao;
import ge.ufc.inhouseProjects.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectServiceIml implements ProjectService{

    @Autowired
    ProjectDao dao;

    @Override
    @Transactional(readOnly = true)
    public List<Project> findAll(){
        List<Project> projects = new ArrayList<>();
        dao.findAll().forEach(projects::add);
        return projects;
    }

    @Override
    @Transactional(readOnly = true)
    public Project findById(Long id){
        return dao.findById(id).get();
    }
}
