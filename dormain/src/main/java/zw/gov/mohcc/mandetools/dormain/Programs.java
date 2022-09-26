package zw.gov.mohcc.mandetools.dormain;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "programs")
public class Programs {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "programId")
    private int programId;

    @Column(name = "programName")
    private String programName;
}
