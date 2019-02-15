package ge.ufc.inhouseProjects.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "my_test_projects")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "service_type")
    private ServiceType serviceType;

}
