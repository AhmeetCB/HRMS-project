package AhmetCB.HRMS.api.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import AhmetCB.HRMS.business.abstracts.CandicateService;
import AhmetCB.HRMS.core.utilities.results.DataResult;
import AhmetCB.HRMS.core.utilities.results.ErrorDataResult;
import AhmetCB.HRMS.entities.concretes.Candicate;

@RestController
@RequestMapping("/api/candicates")
public class CandicatesController {
	
	private CandicateService candicateService;

	@Autowired
	public CandicatesController(CandicateService candicateService) {
		super();
		this.candicateService = candicateService;
	}
	@GetMapping("/getAll")
	public DataResult<List<Candicate>> getAll(){
		return this.candicateService.getAll();
	}
	
	@PostMapping("/addCandicate")
	public ResponseEntity<?> add(@Valid @RequestBody Candicate candicate) {
		return ResponseEntity.ok(this.candicateService.add(candicate));
	}
	

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorDataResult<Object> handleValidationException(MethodArgumentNotValidException exceptions) {
		Map<String, String> validationErrors = new HashMap<String, String>();
		for (FieldError fieldError : exceptions.getBindingResult().getFieldErrors()) {
			validationErrors.put(fieldError.getField(), fieldError.getDefaultMessage());
		}
		ErrorDataResult<Object> errors=new ErrorDataResult<Object>(validationErrors,"Doğrulama Hataları");
		return errors;
		
	}

}
