package _05_vault;

public class JamesBond {
	JamesBond(){
		System.out.println("boom");
	}
	int findCode(Vault v){
		for (int i = 0; i < 1000001; i++) {
			if (v.tryCode(i)) {
				System.out.println(i + " is the code!");
				return i;
			}
		}
		return -1;
		
	}
}
