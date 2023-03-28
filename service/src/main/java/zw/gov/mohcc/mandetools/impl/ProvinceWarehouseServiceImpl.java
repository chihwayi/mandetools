package zw.gov.mohcc.mandetools.impl;

import org.springframework.beans.factory.annotation.Autowired;
import zw.gov.mohcc.mandetools.api.ProvinceWarehouseService;
import zw.gov.mohcc.mandetools.dormain.ProvinceIssued;
import zw.gov.mohcc.mandetools.repositories.ProvinceIssuedRepository;

import java.util.Collection;
import java.util.Optional;

public class ProvinceWarehouseServiceImpl implements ProvinceWarehouseService {

    @Autowired
    private ProvinceIssuedRepository provinceIssuedRepository;

    @Override
    public void addProvinceTools(ProvinceIssued provinceWarehouse) {

    }

    @Override
    public void updateProvinceTools(int issueId, ProvinceIssued warehouse) {

    }

    @Override
    public Optional<ProvinceIssued> findProvinceTools(int issueId, int provinceId) {
        return Optional.empty();
    }

    @Override
    public Collection<ProvinceIssued> getAllProvinceTools(int provinceId) {
        return null;
    }
}
