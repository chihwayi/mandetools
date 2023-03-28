package zw.gov.mohcc.mandetools.impl;

import zw.gov.mohcc.mandetools.api.DistrictWarehouseService;
import zw.gov.mohcc.mandetools.dormain.DistrictIssued;

import java.util.Collection;
import java.util.Optional;

public class DistrictWarehouseServiceImpl implements DistrictWarehouseService {
    @Override
    public void addDistrictTools(DistrictIssued districtWarehouse) {

    }

    @Override
    public void updateDistrictTools(int issueId, DistrictIssued warehouse) {

    }

    @Override
    public Optional<DistrictIssued> findDistrictTools(int issueId, int provinceId, String districtId) {
        return Optional.empty();
    }

    @Override
    public Collection<DistrictIssued> getAllDistrictTools(int provinceId, String districtId) {
        return null;
    }
}
