
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
@Table(name = "stok_karti")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class StokKarti {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id ;
	@Column(name = "stok_kodu")
	private String stokKodu ;
	@Column(name = "kdv_kodu")
	private String kdvKodu;
	@Column(name = "stok_adi")
	private String stokAdi;
	@Column(name = "kdv_adi")
	private String kdvAdi;
	@Column(name = "orani")
	private double orani;
	
}
