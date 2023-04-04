package zw.gov.mohcc.mandetools.dtos;
import lombok.*;

import java.math.BigDecimal;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseQuantitiesDto {
    private int warehouseId;
    private BigDecimal quantityAvailable;
    private Date dateCreated;
    private String version;
    private String languagesName;
    private String toolName;
    private String programName;
}
