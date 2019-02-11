package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.entity.Project;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProjectService {
     List<Project> findAll();
     Project findById(Long id);

}
