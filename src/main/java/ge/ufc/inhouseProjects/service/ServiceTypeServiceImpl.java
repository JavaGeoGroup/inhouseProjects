package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.dao.ServiceTypeDao;
import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServiceTypeServiceImpl implements  ServiceTypeService {
    @Autowired
    ServiceTypeDao repository;

    @Override
    public ServiceType findServiceTypeByName(String name) {
        return repository.findServiceTypeByName(name);
    }
}
