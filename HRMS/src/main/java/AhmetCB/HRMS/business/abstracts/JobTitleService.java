package AhmetCB.HRMS.business.abstracts;

import java.util.List;


import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.entities.concretes.JobTitle;


public interface JobTitleService {
	DataResult<List<JobTitle>> getAll(); 
	Result add(JobTitle jobTitle);

}
