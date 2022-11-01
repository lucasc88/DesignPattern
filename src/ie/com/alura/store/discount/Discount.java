package ie.com.alura.store.discount;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public abstract class Discount {

	protected Discount next;

	public Discount(Discount discount) {
		this.next = discount;
	}

	public abstract BigDecimal calculate(Budget b);
}
