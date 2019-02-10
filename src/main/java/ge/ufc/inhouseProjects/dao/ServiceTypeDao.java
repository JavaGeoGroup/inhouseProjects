package ge.ufc.inhouseProjects.dao;

import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(rollbackFor = Throwable.class)
public interface ServiceTypeDao extends CrudRepository<ServiceType,Long> {

    //@Query("SELECT u FROM ServiceType u WHERE u.id = ?1")
    //ServiceType findServiceTypeById(int id);
    ServiceType findServiceTypeByName(String name);
}
