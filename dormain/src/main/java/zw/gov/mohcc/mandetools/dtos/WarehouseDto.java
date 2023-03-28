package zw.gov.mohcc.mandetools.dtos;
import lombok.*;

import java.sql.Date;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseDto {
    private int warehouseId;
    private int quantityAvailable;
    private Date dateCreated;
    private String version;
    private String languagesName;
    private String toolName;
    private String programName;
}
