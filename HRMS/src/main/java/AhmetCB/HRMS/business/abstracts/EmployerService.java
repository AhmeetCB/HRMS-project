package AhmetCB.HRMS.business.abstracts;

import java.util.List;

import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.entities.concretes.Employer;

public interface EmployerService {
	DataResult<List<Employer>> getAll(); 
	Result add(Employer employer);

}
