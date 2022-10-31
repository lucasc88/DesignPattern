package ie.com.alura.store.tax;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class TaxCalculator {

	/**
	 * Receive Budge and TaxType to calculate the tax about ICMS (0.1) or ISS
	 * (0.06). Strategy Pattern: avoid a lot of IFs using an Interface. Each class
	 * implements their methods to calculate the tax.
	 * 
	 * @param b
	 * @param tax
	 * @return
	 */
	public BigDecimal calculate(Budget b, TaxType tax) {
		return tax.calculate(b);
	}
}
