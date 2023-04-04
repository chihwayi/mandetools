package zw.gov.mohcc.mandetools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.gov.mohcc.mandetools.api.ProvinceService;
import zw.gov.mohcc.mandetools.dormain.Province;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class ProvinceServiceController {

    @Autowired
    ProvinceService provinceService;

    @RequestMapping(value = "/province", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Province>> getAllProvinces(){
        List<Province> result = provinceService.getAllProvinces();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
