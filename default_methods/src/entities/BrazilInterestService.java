package entities;

import java.security.InvalidParameterException;

public class BrazilInterestService implements InterestService {

	private Double interesRate;

	public BrazilInterestService(Double interesRate) {
		this.interesRate = interesRate;
	}

	@Override
	public double getInteresRate() {
		return interesRate;
	}
}
