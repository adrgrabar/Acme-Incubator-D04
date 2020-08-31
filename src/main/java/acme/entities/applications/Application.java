
package acme.entities.applications;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Application extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	@Pattern(regexp = "[A-Z]{3}-\\d{2}-\\d{6}")
	private String				ticker;

	@Past
	@Temporal(TemporalType.TIMESTAMP)
	private Date				date;

	@NotBlank
	private String				statement;

	@NotBlank
	@Valid
	private Money				offer;
}
