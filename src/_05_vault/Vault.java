package _05_vault;

import java.util.Random;

public class Vault {
	int secretCode;
	Vault(){
		secretCode = new Random().nextInt(1_000_001);
	}
	boolean tryCode(int code) {
		if (code == secretCode) {
			return true;
		}
		else {
			return false;
		}
		
	}

}
