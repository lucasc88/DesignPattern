package ie.com.alura.store;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;
import ie.com.alura.store.discount.DiscountCalculator;
import ie.com.alura.store.tax.ICMS;
import ie.com.alura.store.tax.ISS;
import ie.com.alura.store.tax.TaxCalculator;

public class Test {

	public static void main(String... strings) {
		Budget b = new Budget(new BigDecimal("200"), 6);
		Budget b1 = new Budget(new BigDecimal("1000"), 1);
		TaxCalculator c = new TaxCalculator();
		System.out.println("ICMS: " + c.calculate(b, new ICMS()));
		System.out.println("ISS: " + c.calculate(b, new ISS()));
		
		DiscountCalculator d = new DiscountCalculator();
		System.out.println("Discount: " + d.calculate(b));
		System.out.println("Discount: " + d.calculate(b1));
	}
}
