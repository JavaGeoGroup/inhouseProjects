package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServiceTypeService {
    ServiceType findServiceTypeByName(String name);
    public List<ServiceType> findAll();
}
