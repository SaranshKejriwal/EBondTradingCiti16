package ebond.trader.jpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="BONDS")
public class Bond {
	//Bean for Bond
	@Id
	private String isin;
	private String bondName;
	
	public Bond(){
		
	}

	public Bond(String bondName) {
		super();
		this.bondName = bondName;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getBondName() {
		return bondName;
	}
	public void setBondName(String bondName) {
		this.bondName = bondName;
	}
}
