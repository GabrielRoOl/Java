package entities;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInteresRate();
	
	default double payment(double amount, int months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero.");
		}
		return amount * Math.pow(1 + getInteresRate() / 100, months);
	}
}
