package ie.com.alura.store.budget;

import java.math.BigDecimal;

public class Budget {

	private BigDecimal value;
	private int itemQuatity;

	public Budget(BigDecimal value, int itemQuatity) {
		super();
		this.value = value;
		this.itemQuatity = itemQuatity;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}

	public int getItemQuatity() {
		return itemQuatity;
	}

	public void setItemQuatity(int itemQuatity) {
		this.itemQuatity = itemQuatity;
	}

}
