package AhmetCB.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import AhmetCB.HRMS.entities.concretes.Candicate;

public interface CandicateDao extends JpaRepository<Candicate, Integer> {

}
