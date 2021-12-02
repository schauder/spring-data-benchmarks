package demo.jpa;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter

@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private boolean enabled;
}
