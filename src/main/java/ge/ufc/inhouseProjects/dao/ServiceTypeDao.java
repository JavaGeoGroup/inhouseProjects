package ge.ufc.inhouseProjects.dao;

import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(rollbackFor = Throwable.class)
public interface ServiceTypeDao extends CrudRepository<ServiceType,Long> {

    ServiceType findServiceTypeByName(String name);
}
