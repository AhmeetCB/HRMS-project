package AhmetCB.HRMS.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import AhmetCB.HRMS.entities.abstracts.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;



@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@PrimaryKeyJoinColumn(name = "user_id")
@Table(name = "candicates")
@EqualsAndHashCode(callSuper = true)
public class Candicate extends User {
	

    @NotNull(message = "First name cannot be empty.")
    @Column
	private String first_name;

    @NotNull(message = "Last name cannot be empty.")
    @Column
	private String last_name;

    @NotNull(message = "National ID cannot be empty.")
    @Size(min = 11, max = 11)
    @Column(unique = true)
	private String nationality_identity;

    @NotNull(message = "Date of birth cannot be empty. e.g.: 2004")
    @Column
    private String dateOfBirth;

}
