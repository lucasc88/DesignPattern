package ie.com.alura.store.tax;

import java.math.BigDecimal;

import ie.com.alura.store.budget.Budget;

public interface TaxType {

	BigDecimal calculate(Budget b);
}
