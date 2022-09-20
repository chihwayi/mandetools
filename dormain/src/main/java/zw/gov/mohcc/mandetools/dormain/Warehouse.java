package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "warehouse")
public class Warehouse {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouseID")
    private int warehouseId;

    @Column(name = "toolsID")
    private int toolsId;

   @Column(name = "quantityAvailable")
    private int quantityAvailable;

    @Column(name = "languageID")
    private int languageId;

    @Column(name = "program")
    private String program;
}
