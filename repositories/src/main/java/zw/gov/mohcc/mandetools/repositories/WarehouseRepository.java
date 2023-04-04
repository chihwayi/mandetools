package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.Warehouse;

import javax.persistence.Tuple;
import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Long>{

    @Query(value = "SELECT warehouse.warehouseID,warehouse.quantityAvailable,warehouse.dateCreated,warehouse.version,languages.languageName,tools.toolName,programs.programName " +
            "from warehouse JOIN tools ON warehouse.toolsID = tools.toolId JOIN languages ON warehouse.languageID = languages.languageID " +
            "JOIN programs ON tools.programId = programs.programId", nativeQuery=true)
    List<Tuple> findAllByWarehouseIdIsNotNull();

    @Query(value = "WITH total AS ( SELECT warehouse.warehouseID ,SUM(warehouse.quantityAvailable) OVER(PARTITION BY tools.toolId) as quantityAvailable\n" +
            "                      , warehouse.dateCreated\n" +
            "                      , warehouse.version\n" +
            "                      , languages.languageName\n" +
            "                      , tools.toolName\n" +
            "                      , programs.programName\n" +
            "                      , ROW_NUMBER() OVER (PARTITION BY tools.toolId ORDER BY warehouse.dateCreated DESC) AS rownum\n" +
            "                FROM warehouse JOIN tools ON warehouse.toolsID = tools.toolId JOIN languages ON \n" +
            "                warehouse.languageID = languages.languageID JOIN programs ON tools.programId = programs.programId\n" +
            "                )\n" +
            "SELECT warehouseID, quantityAvailable, dateCreated, version, languageName, toolName, programName\n" +
            "FROM total\n" +
            "WHERE rownum = 1", nativeQuery=true)
    List<Tuple> getWarehouseByQuantityAvailable();

}
