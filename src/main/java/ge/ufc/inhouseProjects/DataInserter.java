package ge.ufc.inhouseProjects;

import ge.ufc.inhouseProjects.dao.ServiceTypeDao;
import ge.ufc.inhouseProjects.entity.ServiceType;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInserter implements InitializingBean {

    @Autowired
    private ServiceTypeDao serviceTypeDao;

    @Override
    public void afterPropertiesSet() throws Exception {
        ServiceType st = new ServiceType(); 
        st.setName("test");
        serviceTypeDao.save(st);
        System.out.println("saved dao: " + st );
    } 
}
