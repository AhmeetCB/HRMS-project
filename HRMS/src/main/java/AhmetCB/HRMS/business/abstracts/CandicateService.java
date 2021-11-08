package AhmetCB.HRMS.business.abstracts;

import java.util.List;

import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.entities.concretes.Candicate;


public interface CandicateService {
	DataResult<List<Candicate>> getAll(); 
	Result add(Candicate candicate);
}
