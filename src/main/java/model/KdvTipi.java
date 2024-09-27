package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "kdv_tipi")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Audited
public class KdvTipi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name =  "kodu")
	private String kodu ;
	@Column(name = "adi")
	private String adi ;
	@Column(name = "orani")
	private double orani ;	
}
