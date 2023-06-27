package zw.gov.mohcc.mandetools.api;

import zw.gov.mohcc.mandetools.dormain.Tools;

import java.util.List;

public interface ToolService {
    public abstract void configTools(Tools tools);
    public abstract void editToolsConfig(Tools tools);
    public abstract List<Tools> listAllToolsConfig();
    public abstract List<Tools> getToolsByName(String name);
}
