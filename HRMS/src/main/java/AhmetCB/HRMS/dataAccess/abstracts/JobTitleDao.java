package AhmetCB.HRMS.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import AhmetCB.HRMS.entities.concretes.JobTitle;

public interface JobTitleDao extends JpaRepository<JobTitle, Integer> {

}
