package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.entity.Project;

import java.util.List;

public interface ProjectService {
     List<Project> findAll();
     Project findById(Long id);
     void deleteProjectById(Long id);
}
