package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "district")
public class District {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "ProvinceID")
    private int provinceId;

    @Column(name = "DistrictName")
    private String districtName;

    @Column(name = "DistrictCode")
    private String districtCode;
}
