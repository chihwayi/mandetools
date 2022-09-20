package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.ProvinceIssued;

@Repository
public interface ProvinceIssuedRepository extends JpaRepository<ProvinceIssued,Integer>{
}
