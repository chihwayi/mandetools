package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mohcc.mandetools.api.ToolService;
import zw.gov.mohcc.mandetools.dormain.Tools;
import zw.gov.mohcc.mandetools.repositories.ToolsRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ToolServiceImpl implements ToolService {

    @Autowired
    private ToolsRepository toolsRepository;

    @Override
    public void configTools(Tools tools) {
        toolsRepository.save(tools);
    }

    @Override
    public void editToolsConfig(Tools tools) {

    }

    @Override
    public List<Tools> listAllToolsConfig() {
        return toolsRepository.findAll();
    }

    @Override
    public List<Tools> getToolsByName(String name) {
        List<Tools> list = new ArrayList<>();
        listAllToolsConfig().stream().forEach(
                t -> {
                    String tool_name = t.getToolName();
                    if(tool_name.equalsIgnoreCase(name)){
                        list.add(t);
                    }
                }
        );

        return list;
    }
}
