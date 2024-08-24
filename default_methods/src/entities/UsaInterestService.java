package entities;

import java.security.InvalidParameterException;

public class UsaInterestService implements InterestService {

	private Double interesRate;

	public UsaInterestService(Double interesRate) {
		this.interesRate = interesRate;
	}

	@Override
	public double getInteresRate() {
		return interesRate;
	}
}
