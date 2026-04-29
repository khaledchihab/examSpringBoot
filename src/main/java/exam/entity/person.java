package exam.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;
@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private role role;
    private int NbrMonthsTrain;
    private LocalDate DateOfBirth;

    @OneToMany(mappedBy = "coach", cascade = CascadeType.ALL)
    private Set<course> coachedCourses;

    @ManyToMany(mappedBy = "athletes", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Set<course> courses;

}
