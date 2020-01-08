package services;

public class UsaInterestService implements InterestService {

	private Double interestRate;

	public UsaInterestService(Double interestRate) {
		super();
		this.interestRate = interestRate;
	}
	
	@Override
	public double getInterestRate() {
		return interestRate;
	}
	
}
