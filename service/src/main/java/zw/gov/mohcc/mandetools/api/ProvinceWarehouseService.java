package zw.gov.mohcc.mandetools.api;

import zw.gov.mohcc.mandetools.dormain.ProvinceIssued;

import java.util.Collection;
import java.util.Optional;

public interface ProvinceWarehouseService {
    public abstract void addProvinceTools(ProvinceIssued provinceWarehouse);
    public abstract void updateProvinceTools(int issueId, ProvinceIssued warehouse);
    public abstract Optional<ProvinceIssued> findProvinceTools(int issueId, int provinceId);
    public abstract Collection<ProvinceIssued> getAllProvinceTools(int provinceId);
}
