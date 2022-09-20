package zw.gov.mohcc.mandetools.dormain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "event_logs")
public class EventLogs {
    @Id
    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "logId")
    private int logId;

    @Column(name = "logType")
    private String logType;

    @Column(name = "logDescription")
    private String logDescription;

    @Column(name = "logLevel")
    private  String logLevel;

    @Column(name = "dateLogged")
    private LocalDateTime dateLogged;

    @Column(name = "provinceId")
    private  int provinceId;

    @Column(name = "districtId")
    private  String districtId;

    @Column(name = "facilityId")
    private  String facilityId;

    @Column(name = "toolId")
    private  int toolId;

    @Column(name = "languageId")
    private int languageId;

    @Column(name = "quantity")
    private  int quantity;

}
