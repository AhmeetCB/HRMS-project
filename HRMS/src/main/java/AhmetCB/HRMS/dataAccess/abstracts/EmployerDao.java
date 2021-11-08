package AhmetCB.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import AhmetCB.HRMS.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {

}
