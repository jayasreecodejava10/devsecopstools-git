package com.nt.payment;

public class DigitalPayment {

	public String NetBanking(long UPID,double amnt) {
		return amnt+"is received from this"+UPID;
	}
	public String CashBackOffer(long txID,double amnt) {
		return amnt*0.05+"points are added to this"+txID+"as reward points";
	}
}
