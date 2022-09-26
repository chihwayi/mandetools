package zw.gov.mohcc.mandetools.dtos;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class WarehouseDto {
    private int warehouseId;
    private int quantityAvailable;
    private String languagesName;
    private String toolName;
    private String programName;
}
