package ge.ufc.inhouseProjects.dao;

import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ServiceTypeDao extends CrudRepository<ServiceType,Long> {


    //ServiceType findServiceTypeById(int id);
    @Query("SELECT u FROM ServiceType u WHERE u.name = ?1")
    ServiceType findServiceTypeByName(String name);
}
