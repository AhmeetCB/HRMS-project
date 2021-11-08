package AhmetCB.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import AhmetCB.HRMS.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="employers")
@PrimaryKeyJoinColumn(name = "user_id")
@EqualsAndHashCode(callSuper = true)
public class Employer extends User {

	@NotNull(message = "Company name cannot be empty.")
	@Column(name="company_name")
	private String companyName;
	
	@NotNull(message = "Web site cannot be empty.")
	@Column(name="website")
	private String website;
	
	@NotNull(message = "Phone number cannot be empty.")
	@Column(name="phone_number")
	private String phoneNumber;
	
}
