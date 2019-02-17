package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.dao.ServiceTypeDao;
import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceTypeServiceImpl implements  ServiceTypeService {

    private ServiceTypeDao repository;

    @Autowired
    public ServiceTypeServiceImpl(ServiceTypeDao repository) {
        this.repository = repository;
    }

    @Override
    public ServiceType findServiceTypeByName(String name) {
        return repository.findServiceTypeByName(name);
    }

    @Override
    public List<ServiceType> findAll(){
        Iterable<ServiceType> iterable = repository.findAll();
        List<ServiceType> types = new ArrayList<>();
        iterable.forEach(types::add);
        return types;
    }
}
