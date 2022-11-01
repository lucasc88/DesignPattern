package ie.com.alura.store.discount;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class DiscountForValueMoreThan500 extends Discount {

	public DiscountForValueMoreThan500(Discount next) {
		super(next);
	}
	
	public BigDecimal calculate(Budget b) {
		if (b.getValue().compareTo(new BigDecimal("500")) > 0) {
			return b.getValue().multiply(new BigDecimal("0.05"));
		}
		return next.calculate(b);
	}
}
