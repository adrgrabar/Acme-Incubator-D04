
package acme.entities.overtures;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Overture extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				title;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	private Date				date;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Date				deadline;

	@NotBlank
	@Column(length = 1024)
	private String				description;

	@NotNull
	private Money				moneyStart;

	@NotNull
	private Money				moneyEnd;

	@NotBlank
	@Email
	private String				email;
}
