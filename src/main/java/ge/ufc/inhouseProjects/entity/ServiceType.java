package ge.ufc.inhouseProjects.entity;

import lombok.Data;

import javax.persistence.*;

import java.util.List;

@Data
@Entity
@Table(name = "SERVICE_TYPES")
public class ServiceType {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //use the same type than in repository! int =! long

    @Column(name = "name")
    private String name;

    @OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "serviceType")
    private List<Project> projectList;
}
