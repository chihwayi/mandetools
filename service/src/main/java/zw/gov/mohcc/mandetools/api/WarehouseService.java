package zw.gov.mohcc.mandetools.api;

import java.util.Collection;
import zw.gov.mohcc.mandetools.dormain.Warehouse;

public interface WarehouseService {
    public abstract void addTools(Warehouse warehouse);
    public abstract void addTools();
    public abstract void updateTools(int id, Warehouse warehouse);
    public abstract void assignTools(int id);
    public abstract Collection<Warehouse> getTools();
}
