package ge.ufc.inhouseProjects.dao;

import ge.ufc.inhouseProjects.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = Throwable.class)
public interface ProjectDao extends CrudRepository<Project,Long> {
    /*List<Project> findProjectsByNameContains(String name);
    Project findProjectById(int id);
    Project findProjectByName(String name);*/
}
