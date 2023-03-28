package zw.gov.mohcc.mandetools.api;

import zw.gov.mohcc.mandetools.dormain.FacilitiesIssued;

import java.util.Collection;
import java.util.Optional;

public interface FacilityWarehouseService {
    public abstract void addFacilityTools(FacilitiesIssued facilityWarehouse);
    public abstract void updateFacilityTools(int issueId, FacilitiesIssued warehouse);
    public abstract Optional<FacilitiesIssued> findFacilityTools(int issueId, int provinceId, String districtId, String facilityId);
    public abstract Collection<FacilitiesIssued> getAllFacilityTools(int provinceId, String districtId, String facilityId);
}
