package ge.ufc.inhouseProjects.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PROJECTS")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "service_type")
    private ServiceType serviceType;

}
