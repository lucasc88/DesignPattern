package ie.com.alura.store.tax;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class ISS implements TaxType {

	public BigDecimal calculate(Budget b) {
		return b.getValue().multiply(new BigDecimal("0.06")); 
	}
}
