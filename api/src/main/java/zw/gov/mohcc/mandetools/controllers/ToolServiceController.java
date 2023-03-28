package zw.gov.mohcc.mandetools.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.gov.mohcc.mandetools.api.ToolService;
import zw.gov.mohcc.mandetools.api.WarehouseService;
import zw.gov.mohcc.mandetools.dormain.Tools;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ToolServiceController {

    @Autowired
    private ToolService toolService;

    @RequestMapping(value = "/tools", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Tools>> getToolsInWarehouse(){
        List<Tools> result =  toolService.listAllToolsConfig();

        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
