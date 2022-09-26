package zw.gov.mohcc.mandetools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.api.WarehouseService;

@RestController
public class WarehouseServiceController {

    @Autowired
    private WarehouseService warehouseService;

    @RequestMapping(value = "/tools", method = RequestMethod.GET)
    public ResponseEntity<Object> getTools(){
        return new ResponseEntity<>(warehouseService.getTools(), HttpStatus.FOUND);
    }

    @RequestMapping(value = "/warehouse", method = RequestMethod.POST)
    public ResponseEntity<Object> createTool(@RequestBody Warehouse warehouse){
        warehouseService.addTools(warehouse);
        return new ResponseEntity<>("Tool has been added successfully", HttpStatus.CREATED);
    }

    @RequestMapping(value = "/tools/{toolsID}", method = RequestMethod.GET)
    public ResponseEntity<Object> getToolByID(@PathVariable("toolsID") int toolsID){
        return new ResponseEntity<>(warehouseService.findTools(toolsID), HttpStatus.FOUND);
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ResponseEntity<Object> showAvailableTools(){
        return new ResponseEntity<>(warehouseService.findAllInWarehouse(), HttpStatus.FOUND);
    }

}
