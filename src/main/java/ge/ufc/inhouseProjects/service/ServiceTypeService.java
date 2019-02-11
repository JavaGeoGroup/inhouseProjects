package ge.ufc.inhouseProjects.service;

import ge.ufc.inhouseProjects.entity.ServiceType;

public interface ServiceTypeService {
    ServiceType findServiceTypeByName(String name);
}
