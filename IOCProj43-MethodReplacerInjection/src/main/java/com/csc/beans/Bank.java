package com.csc.beans;

public class Bank {
	public float calcIntrAmt(float pAmt, float time) {
		System.out.println("Bank::caclIntrAmt(-,-)");
		return pAmt * time * 2.0f / 100f;
	}

	public float calcIntrAmt(float pAmt) {
		System.out.println("Bank::caclIntrAmt(-)");
		return pAmt * 12.0f * 2.0f / 100f;
	}
}
