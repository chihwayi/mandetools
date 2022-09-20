package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "facilities_issued")
public class FacilitiesIssued {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "issueId")
    private int issueId;

    @Column(name = "provinceId")
    private int provinceId;

    @Column(name = "districtId")
    private String districtId;

    @Column(name = "facilityId")
    private String facilityId;

    @Column(name = "toolId")
    private int toolId;

    @Column(name = "languageId")
    private int languageId;

    @Column(name = "quantity")
    private int quantity;
}
