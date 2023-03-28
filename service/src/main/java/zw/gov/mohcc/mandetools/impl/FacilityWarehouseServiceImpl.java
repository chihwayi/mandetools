package zw.gov.mohcc.mandetools.impl;

import zw.gov.mohcc.mandetools.api.FacilityWarehouseService;
import zw.gov.mohcc.mandetools.dormain.FacilitiesIssued;

import java.util.Collection;
import java.util.Optional;

public class FacilityWarehouseServiceImpl implements FacilityWarehouseService {
    @Override
    public void addFacilityTools(FacilitiesIssued facilityWarehouse) {

    }

    @Override
    public void updateFacilityTools(int issueId, FacilitiesIssued warehouse) {

    }

    @Override
    public Optional<FacilitiesIssued> findFacilityTools(int issueId, int provinceId, String districtId, String facilityId) {
        return Optional.empty();
    }

    @Override
    public Collection<FacilitiesIssued> getAllFacilityTools(int provinceId, String districtId, String facilityId) {
        return null;
    }
}
