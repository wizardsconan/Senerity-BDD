package vn.amabay.features.register;

import vn.amabay.models.Account;

public class RadomStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account info= new Account("ABCD", "abcd@gmail.com", "0984309888", "123456", "1234567");
	
		System.out.println(info.getEmail());
	}

}
