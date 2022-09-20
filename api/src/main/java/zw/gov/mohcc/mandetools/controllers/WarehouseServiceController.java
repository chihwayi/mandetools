package zw.gov.mohcc.mandetools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.api.WarehouseService;

@RestController
public class WarehouseServiceController {

    @Autowired
    WarehouseService warehouseService;

    @RequestMapping(value = "/tools")
    public ResponseEntity<Object> getTools(){
        return new ResponseEntity<>(warehouseService.getTools(), HttpStatus.FOUND);
    }

    @RequestMapping(value = "/warehouse", method = RequestMethod.POST)
    public ResponseEntity<Object> createTool(@RequestBody Warehouse warehouse){
        warehouseService.addTools(warehouse);
        return new ResponseEntity<>("Product is created successfully", HttpStatus.CREATED);
    }
}
