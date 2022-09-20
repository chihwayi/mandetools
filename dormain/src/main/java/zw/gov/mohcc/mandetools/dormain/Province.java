package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "province")
public class Province {
    @Column(name = "ID")
    private int Id;

    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ProvinceName")
    private String provinceName;

    @Column(name = "ProvinceCode")
    private String provinceCode;
}
