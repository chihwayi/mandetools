package zw.gov.mohcc.mandetools.api;

import zw.gov.mohcc.mandetools.dormain.DistrictIssued;

import java.util.Collection;
import java.util.Optional;

public interface DistrictWarehouseService {
    public abstract void addDistrictTools(DistrictIssued districtWarehouse);
    public abstract void updateDistrictTools(int issueId, DistrictIssued warehouse);
    public abstract Optional<DistrictIssued> findDistrictTools(int issueId, int provinceId, String districtId);
    public abstract Collection<DistrictIssued> getAllDistrictTools(int provinceId, String districtId);
}
