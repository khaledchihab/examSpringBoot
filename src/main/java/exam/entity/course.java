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


public class course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int numb;
    private LocalDate date;
    private int duration;
    @Enumerated(EnumType.STRING)
    private level level;

    @ManyToOne
    private person coach;

    @ManyToMany
    private Set<person> athletes;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
    private Set<exercise> exercises;
}
