package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "facilities")
public class Facilities {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FacilityID")
    private int facilityId;

    @Column(name = "ProvinceCode")
    private int provinceCode;

    @Column(name = "DistrictCode")
    private String districtCode;

    @Column(name = "FacilityCode")
    private String facilityCode;

    @Column(name = "FacilityName")
    private String facilityName;

    @Column(name = "FullFacilityCode")
    private String fullFacilityCode;

    @Column(name = "FullFacilityCodeDashes")
    private String fullFacilityCodeDashes;
}
