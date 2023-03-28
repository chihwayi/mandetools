package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mohcc.mandetools.api.WarehouseService;
import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.dtos.WarehouseDto;
import zw.gov.mohcc.mandetools.repositories.WarehouseRepository;

import javax.persistence.Tuple;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private WarehouseRepository warehouseRepository;

    @Override
    public void addTools(Warehouse warehouse) {
        warehouseRepository.save(warehouse);
    }


    @Override
    public void updateTools(int id, Warehouse warehouse) {

    }

    @Override
    public Optional<Warehouse> findTools(int id) {
        return warehouseRepository.findById((long) id);
    }

    @Override
    public Collection<Warehouse> getTools() {
        return  warehouseRepository.findAll();
    }

    @Override
    public List<WarehouseDto> findAllInWarehouse() {
        List<Tuple> warehouseTotalTuples = warehouseRepository.findAllByWarehouseIdIsNotNull();
        List<WarehouseDto> warehouseDtoList = warehouseTotalTuples.stream().map(
                t -> new WarehouseDto(
                        t.get(0, Integer.class),
                        t.get(1, Integer.class),
                        t.get(2, java.sql.Date.class),
                        t.get(3, String.class),
                        t.get(4, String.class),
                        t.get(5, String.class),
                        t.get(6, String.class)
                )
        ).collect(Collectors.toList());

        return warehouseDtoList;
    }
}
