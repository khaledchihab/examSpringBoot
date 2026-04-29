package exam.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private int NbrOfRepetitions;
    private int BreakTime;
    private int duration;

    @ManyToOne
    @Enumerated(EnumType.STRING)
    private course course;
}