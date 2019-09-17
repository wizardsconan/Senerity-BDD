package vn.amabay.pages;

import vn.amabay.MyPageObject;

public class RegisterPage extends MyPageObject{
	private static final String ALERT_DANGER_TEXT = "//div[@class='alert alert-danger text-center']";

	private static final String CORFIRM_PASSWORD = "Nhập lại mật khẩu";

	private static final String PASSWORD = "Mật khẩu";

	private static final String PHONE_NUMBER = "Số điện thoại";

	private static final String EMAIL_ADDRESS = "Địa chỉ Email";

	private static final String FullName = "Họ và tên";

	
	//private static final String ConfirmPassword_Field = "//label[contains(text(),'Nhập lại mật khẩu')]/following-sibling::input";
	//private static final String Password_Field = "//label[contains(text(),'Mật khẩu')]/following-sibling::input";
	
	private static final String TARGET= "//label[contains(text(),'%s')]/following-sibling::input";
	
	//@FindBy(xpath="//input[@type='text']")
	//WebElementFacade fullNameField;
	public void enterTextIntoFullName(String fullName) {
		//fullNameField.type(fullName);
		element(Target.of( FullName)).type(fullName);
	}
	//@FindBy(xpath="//input[@type='email']")
	//WebElementFacade fullEmailField;
	public void enterTextIntoEmailAddress(String EmailAddress) {
	//	fullEmailField.type(EmailAddress);
		element(Target.of( EMAIL_ADDRESS)).type(EmailAddress);
	}
	
	public void enterTextIntoPhoneNumber(String phoneNumber) {
		//$(Phone_Field).type(phoneNumber);
		element(Target.of( PHONE_NUMBER)).type(phoneNumber);
	}
	
	public void enterTextIntoPass(String Password) {
		//element(String.format(Target, "Mật khẩu")).type(Password);
		element(Target.of( PASSWORD)).type(Password);
	}
	
	public void enterTextIntoConfirmPass(String Password) {
		//element(String.format(TARGET, "Nhập lại mật khẩu")).type(Password);
		element(Target.of( CORFIRM_PASSWORD)).type(Password);
	}
	
	static class Target{
		public static String of(String label) {
			return String.format(TARGET, label);
		}
	}

	public String getWarringErrMessg() {
		// TODO Auto-generated method stub
		return $(ALERT_DANGER_TEXT).getText();
	}
	public void Click_on_Register_button() {
		// TODO Auto-generated method stub
		$("//button[text()='Đăng ký']").click();
	}
	

}
