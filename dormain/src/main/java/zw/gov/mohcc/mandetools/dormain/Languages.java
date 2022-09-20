package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "languages")
public class Languages {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "languageID")
    private int languageId;

    @Column(name = "languagesName")
    private String languagesName;
}
