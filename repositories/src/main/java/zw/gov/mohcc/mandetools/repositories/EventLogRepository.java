package zw.gov.mohcc.mandetools.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import zw.gov.mohcc.mandetools.dormain.EventLogs;

@Repository
public interface EventLogRepository extends JpaRepository<EventLogs,Integer>{
}
