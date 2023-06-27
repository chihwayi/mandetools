package zw.gov.mohcc.mandetools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.api.WarehouseService;
import zw.gov.mohcc.mandetools.dtos.WarehouseDto;
import zw.gov.mohcc.mandetools.dtos.WarehouseQuantitiesDto;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class WarehouseServiceController {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(value = "/warehouse", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Warehouse>> getToolsInWarehouse(){
        List<Warehouse> result = (List<Warehouse>) warehouseService.getTools();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/add_warehouse", method = RequestMethod.POST, produces = APPLICATION_JSON_VALUE, consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Warehouse> createWarehouseTool(@RequestBody Warehouse warehouse){
        warehouseService.addTools(warehouse);
        return new ResponseEntity<>(warehouse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/warehouse/{toolsID}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Optional<Warehouse>> getWarehouseToolByID(@PathVariable("toolsID") int toolsID){
        Optional<Warehouse> result = warehouseService.findTools(toolsID);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/list_warehouse", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<WarehouseDto>> showAvailableToolsInWarehouse(){
        List<WarehouseDto> result = warehouseService.findAllInWarehouse();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/quantities", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<WarehouseQuantitiesDto>> showAvailableQuantitiesInWarehouse(){
        List<WarehouseQuantitiesDto> result = warehouseService.findAllQuantitiesInWarehouseGroupedByToolId();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/quantities/{warehouseID}", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<WarehouseQuantitiesDto>> showOneSelectedQuantityInWarehouse(@PathVariable("warehouseID") int warehouseID){
        List<WarehouseQuantitiesDto> result = warehouseService.findUniqueQuantitiesInWarehouseGroupedByToolId(getAllWarehouseDtos(),warehouseID);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    public List<WarehouseQuantitiesDto> getAllWarehouseDtos(){
        return warehouseService.findAllQuantitiesInWarehouseGroupedByToolId();
    }

}
