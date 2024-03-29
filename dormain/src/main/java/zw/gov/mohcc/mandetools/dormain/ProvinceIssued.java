package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "province_issued")
public class ProvinceIssued {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issueId")
    private int issueId;

    @Column(name = "provinceId")
    private int provinceId;

    @Column(name = "toolId")
    private int toolId;

    @Column(name = "languageId")
    private int languageId;

    @Column(name = "dateCreated")
    private LocalDateTime dateCreated;

    @Column(name = "quantityIssued")
    private int quantityIssued;
}
