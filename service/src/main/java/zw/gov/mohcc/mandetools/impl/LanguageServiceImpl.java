package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mohcc.mandetools.api.LanguageService;
import zw.gov.mohcc.mandetools.dormain.Languages;
import zw.gov.mohcc.mandetools.repositories.LanguagesRepository;

import java.util.List;

@Service
public class LanguageServiceImpl implements LanguageService {

    @Autowired
    private LanguagesRepository languagesRepository;

    @Override
    public void configLanguages(Languages language) {

    }

    @Override
    public void editLanguagesConfig(Languages language) {

    }

    @Override
    public List<Languages> listAllLanguageServiceConfig() {
        return languagesRepository.findAll();
    }
}
