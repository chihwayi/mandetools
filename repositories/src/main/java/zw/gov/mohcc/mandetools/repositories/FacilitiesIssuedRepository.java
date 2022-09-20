package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import zw.gov.mohcc.mandetools.dormain.FacilitiesIssued;

import org.springframework.stereotype.Repository;

@Repository
public interface FacilitiesIssuedRepository extends JpaRepository<FacilitiesIssued,Integer> {
}
