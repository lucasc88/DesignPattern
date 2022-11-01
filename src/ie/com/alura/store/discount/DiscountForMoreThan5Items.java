package ie.com.alura.store.discount;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class DiscountForMoreThan5Items extends Discount{

	public DiscountForMoreThan5Items(Discount discount) {
		super(discount);
	}

	public BigDecimal calculate(Budget b) {
		if (b.getItemQuatity() > 5) {
			return b.getValue().multiply(new BigDecimal("0.1"));
		}
		return next.calculate(b);
	}
}
