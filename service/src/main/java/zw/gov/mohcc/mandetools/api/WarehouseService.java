package zw.gov.mohcc.mandetools.api;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import zw.gov.mohcc.mandetools.dormain.Warehouse;
import zw.gov.mohcc.mandetools.dtos.WarehouseDto;
import zw.gov.mohcc.mandetools.dtos.WarehouseQuantitiesDto;

public interface WarehouseService {
    public abstract void addTools(Warehouse warehouse);
    public abstract void updateTools(int id, Warehouse warehouse);
    public abstract Optional<Warehouse> findTools(int id);
    public abstract Collection<Warehouse> getTools();
    public abstract List<WarehouseDto> findAllInWarehouse();
    public abstract List<WarehouseQuantitiesDto> findAllQuantitiesInWarehouseGroupedByToolId();
}
