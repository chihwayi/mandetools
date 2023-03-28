package zw.gov.mohcc.mandetools.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.gov.mohcc.mandetools.api.LanguageService;
import zw.gov.mohcc.mandetools.dormain.Languages;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class LanguageServiceController {

    @Autowired
    private LanguageService languageService;

    @RequestMapping(value = "/language", method = RequestMethod.GET, produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<List<Languages>> getAllLanguages(){
        List<Languages> result =  languageService.listAllLanguageServiceConfig();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
