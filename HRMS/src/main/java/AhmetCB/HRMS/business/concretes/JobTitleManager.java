package AhmetCB.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AhmetCB.HRMS.business.abstracts.JobTitleService;
import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.core.utilities.results.SuccessDataResult;
import AhmetCB.HRMS.core.utilities.results.SuccessResult;
import AhmetCB.HRMS.dataAccess.abstracts.JobTitleDao;
import AhmetCB.HRMS.entities.concretes.JobTitle;

@Service
public class JobTitleManager implements JobTitleService {

	private JobTitleDao jobTitleDao;
	
	@Autowired
	public JobTitleManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}


	@Override
	public DataResult<List<JobTitle>> getAll() {
		return new SuccessDataResult<List<JobTitle>> (this.jobTitleDao.findAll(),"Pozisyonlar Listelendi");
	}


	@Override
	public Result add(JobTitle jobTitle) {
		this.jobTitleDao.save(jobTitle);
		return new SuccessResult("Pozisyon Eklendi");
	}

}
