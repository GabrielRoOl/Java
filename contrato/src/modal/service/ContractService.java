package modal.service;

import java.time.LocalDate;

import modal.entities.Contract;
import modal.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePayment) {
		this.onlinePaymentService = onlinePayment;
	}

	public void processContract(Contract contract, int months) {

		double basicQuota = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDat = contract.getDate().plusMonths(i);

			double interest = onlinePaymentService.interes(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + fee + interest;

			contract.getInstallment().add(new Installment(dueDat, quota));
		}

	}

}
