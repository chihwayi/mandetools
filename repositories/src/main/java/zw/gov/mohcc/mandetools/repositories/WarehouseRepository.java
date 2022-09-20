package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.Warehouse;

import java.util.List;

@Repository
public interface WarehouseRepository extends JpaRepository<Warehouse,Integer>{

}
