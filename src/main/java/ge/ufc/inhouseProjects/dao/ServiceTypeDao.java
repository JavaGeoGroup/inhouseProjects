package ge.ufc.inhouseProjects.dao;

import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ServiceTypeDao extends CrudRepository<ServiceType,Long> {

    @Query("SELECT u FROM ServiceType u WHERE u.name = ?1")
    ServiceType findServiceTypeByName(String name);
}
