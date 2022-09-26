package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.Warehouse;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long>{

    @Query(value = "SELECT warehouse.warehouseID,warehouse.quantityAvailable,languages.languageName,tools.toolName,programs.programName " +
            "from warehouse JOIN tools ON warehouse.toolsID = tools.toolId JOIN languages ON warehouse.languageID = languages.languageID " +
            "JOIN programs ON tools.programId = programs.programId", nativeQuery=true)
    List<Tuple> findAllByWarehouseIdIsNotNull();

}
