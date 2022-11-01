package ie.com.alura.store.discount;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public class NoDiscount extends Discount {

	public NoDiscount() {
		super(null);
	}

	public BigDecimal calculate(Budget b) {
		return BigDecimal.ZERO;
	}
}
