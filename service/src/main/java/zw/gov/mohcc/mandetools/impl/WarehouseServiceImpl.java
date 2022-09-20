package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mohcc.mandetools.api.WarehouseService;
import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.repositories.WarehouseRepository;

import java.util.*;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    //private static Map<Integer, Warehouse> warehouseMap = new HashMap<>();
    private static List<Warehouse> warehouseList = new ArrayList<>();
    static {
        Warehouse greenBooks = new Warehouse();
        greenBooks.setWarehouseId(1);
        greenBooks.setLanguageId(1);
        greenBooks.setProgram("PMTCT");
        greenBooks.setToolsId(1);
        //greenBooks.setQuantityAvailable(1000);

        Warehouse artRegisters = new Warehouse();
        artRegisters.setWarehouseId(2);
        artRegisters.setLanguageId(2);
        artRegisters.setProgram("ART");
        artRegisters.setToolsId(2);
        //artRegisters.setQuantityAvailable(500);
    }

    @Override
    public void addTools(Warehouse warehouse) {
        //warehouseMap.put(warehouse.getWarehouseId(), warehouse);
        warehouseList.add(warehouse);
    }

    @Override
    public void addTools(){
        Warehouse greenBooks = new Warehouse();
        greenBooks.setLanguageId(1);
        greenBooks.setProgram("PMTCT");
        greenBooks.setToolsId(1);
        //greenBooks.setQuantityAvailable(1000);

        Warehouse artRegisters = new Warehouse();
        artRegisters.setLanguageId(2);
        artRegisters.setProgram("ART");
        artRegisters.setToolsId(2);
       // artRegisters.setQuantityAvailable(500);

        warehouseRepository.save(greenBooks);
        //warehouseRepository.save(artRegisters);
    }

    @Override
    public void updateTools(int id, Warehouse warehouse) {
        /*
        warehouseMap.remove(id);
        warehouse.setWarehouseId(id);
        warehouseMap.put(id, warehouse);


        warehouseList.remove(id);
        warehouse.setWarehouseId(id);
        warehouseList.add(id, warehouse);

         */
    }

    @Override
    public void assignTools(int id) {
        //warehouseMap.remove(id);
        //warehouseList.add();
    }

    @Override
    public Collection<Warehouse> getTools() {
        //return warehouseMap.values();
        //return warehouseList;

        return  warehouseRepository.findAll();
    }
}
