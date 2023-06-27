package zw.gov.mohcc.mandetools.api;

import zw.gov.mohcc.mandetools.dormain.Languages;

import java.util.List;

public interface LanguageService {
    public abstract void configLanguages(Languages language);
    public abstract void editLanguagesConfig(Languages language);
    public abstract List<Languages> listAllLanguageServiceConfig();
    public abstract List<Languages> getLanguagesByName(String name);
}
