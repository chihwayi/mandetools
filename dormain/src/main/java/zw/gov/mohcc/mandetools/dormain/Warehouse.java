package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    private Long warehouseId;

    @Column(name = "toolsID")
    private Long toolsId;

   @Column(name = "quantityAvailable")
    private int quantityAvailable;

    @Column(name = "dateCreated")
    private LocalDateTime dateCreated;

    @Column(name = "languageID")
    private int languageId;

    @Column(name = "version")
    private String version;

}
