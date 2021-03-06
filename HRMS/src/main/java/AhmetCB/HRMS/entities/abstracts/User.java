package AhmetCB.HRMS.entities.abstracts;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "Users")
public abstract class User {
	
	@Id
	@Column(name = "user_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;

    @Email
    @NotNull(message = "Email field cannot be empty.")
    @Column(name = "email", unique = true)
	private String email;

    @NotNull(message = "Password cannot be empty.")
    @Column(name = "password")
	private String password;
	
    @NotNull(message = "Password cannot be empty.")
    @Column(name = "password_again")
	private String passwordAgain;

}
