package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, int months) {
		double bascQuote = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double updatedQuote = bascQuote + onlinePaymentService.interest(bascQuote, i);
			double fullQuote = updatedQuote + onlinePaymentService.paymentFee(updatedQuote);
			Date dueDate = addMonths(contract.getDate(),i);
			
			contract.getInstallments().add(new Installment(dueDate, fullQuote));
		}
	}
	
	private Date addMonths(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.MONTH, n);
		return calendar.getTime();
	}
}
