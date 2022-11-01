package ie.com.alura.store.discount;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class DiscountCalculator {

	public BigDecimal calculate(Budget b) {
		Discount discount = new DiscountForMoreThan5Items(new DiscountForValueMoreThan500(new NoDiscount()));

		return discount.calculate(b);
	}
}
