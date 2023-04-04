package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zw.gov.mohcc.mandetools.api.ProvinceService;
import zw.gov.mohcc.mandetools.dormain.Province;
import zw.gov.mohcc.mandetools.repositories.ProvinceRepository;

import java.util.List;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Override
    public List<Province> getAllProvinces() {
        return provinceRepository.findAll();
    }
}
