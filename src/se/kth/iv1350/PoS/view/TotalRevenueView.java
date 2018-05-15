package se.kth.iv1350.PoS.view;

import se.kth.iv1350.PoS.model.Amount;
import se.kth.iv1350.PoS.model.SaleObserver;

public class TotalRevenueView implements SaleObserver {
	
	private Amount totalAmountPaid;
	
	public TotalRevenueView() {
		totalAmountPaid = new Amount(0);
	}

	@Override
	public void newAmount(Amount revenue) {
		addToTotalAmount(revenue);
		printCurrentState();
	}
	
	private void addToTotalAmount(Amount revenue) {
		totalAmountPaid.addAmount(revenue);
	}
	
	private void printCurrentState() {
		String str = new String();
		str += "Total Revenue: " + totalAmountPaid.getValue();
		System.out.println("#############################################");
		System.out.println("#            TotalRevenueView               #");
		System.out.println("############ - TOTAL REVENUE - ##############");
		System.out.println("#"+ str +"                         #");
		System.out.println("############################################# \n");
	}

}
