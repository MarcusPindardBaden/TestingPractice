package com.qa.MyBlackjack;

public class BlackjackGame {

	public static void main(String[] args) {

	}
	
	
	public int blackjack(int player,int dealer) {
		
		//Run game in here
		if(((player<=21)&&(player>=1))&&((dealer<=21)&&(dealer>=1))){
			if(player>dealer) {
				return player;
			}
			else {
				return dealer;
			}	
		}
		else if(((player<=21)&&(player>=1))&&((dealer>21)&&(dealer<=31))) {
			
			return player;
		}
		else if(((player<=31)&&(player>21))&&((dealer<=21)&&(dealer>=1))) {
			return dealer;
		}
		else {
			return 0;
		}
			}


}
