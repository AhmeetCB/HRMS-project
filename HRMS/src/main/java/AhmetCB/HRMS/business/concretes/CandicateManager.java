package AhmetCB.HRMS.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import AhmetCB.HRMS.business.abstracts.CandicateService;
import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.Result;
import AhmetCB.HRMS.core.utilities.results.SuccessDataResult;
import AhmetCB.HRMS.core.utilities.results.SuccessResult;
import AhmetCB.HRMS.dataAccess.abstracts.CandicateDao;
import AhmetCB.HRMS.entities.concretes.Candicate;

@Service
public class CandicateManager implements CandicateService {

	private CandicateDao candicateDao;
	
	@Autowired
	public CandicateManager(CandicateDao candicateDao) {
		super();
		this.candicateDao = candicateDao;
	}

	@Override
	public DataResult<List<Candicate>> getAll() {
		return new SuccessDataResult<List<Candicate>>(this.candicateDao.findAll(),"Başarıyla Listelendi");
	}

	@Override
	public Result add(Candicate candicate) {
		this.candicateDao.save(candicate);
		return new SuccessResult("Başarıyla Eklendi");
	}

}
