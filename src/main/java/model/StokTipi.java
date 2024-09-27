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
@Table(name =  "stok_tipi")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class StokTipi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name =  "kodu")
	private String kodu; 
	@Column(name = "adi")
	private String adi;
	@Column(name = "aciklama")
	private String aciklama ;	
}


