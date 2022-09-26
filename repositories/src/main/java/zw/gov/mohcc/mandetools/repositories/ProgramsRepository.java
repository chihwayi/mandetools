package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.Programs;

@Repository
public interface ProgramsRepository extends JpaRepository<Programs,Integer> {
}
