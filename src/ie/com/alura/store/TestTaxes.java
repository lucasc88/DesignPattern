package ie.com.alura.store;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;
import ie.com.alura.store.tax.ICMS;
import ie.com.alura.store.tax.ISS;
import ie.com.alura.store.tax.TaxCalculator;

public class TestTaxes {

	public static void main(String... strings) {
		Budget b = new Budget(new BigDecimal("100"));
		TaxCalculator c = new TaxCalculator();
		System.out.println("ICMS: " + c.calculate(b, new ICMS()));
		System.out.println("ISS: " + c.calculate(b, new ISS()));
	}
}
