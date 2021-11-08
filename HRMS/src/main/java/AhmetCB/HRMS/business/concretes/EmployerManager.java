package AhmetCB.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AhmetCB.HRMS.business.abstracts.EmployerService;
import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.core.utilities.results.SuccessDataResult;
import AhmetCB.HRMS.core.utilities.results.SuccessResult;
import AhmetCB.HRMS.dataAccess.abstracts.EmployerDao;
import AhmetCB.HRMS.entities.concretes.Employer;
@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(),"Başarıyla Listelendi");
	}

	@Override
	public Result add(Employer employer) {
		this.employerDao.save(employer);
		return new SuccessResult("Başarıyla Eklendi");
	}

}
