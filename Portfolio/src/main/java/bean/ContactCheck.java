package bean;

public class ContactCheck {
	
	private String name;
	
	private String mail;
	
	private String tel;
	
	private String inquiry;
	
	private int method;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getInquiry() {
		return inquiry;
	}
	
	public void setInquiry(String inquiry) {
		this.tel = inquiry;
	}
	
	public int getMethod() {
		return method;
	}
	
	public void setMethod(int method) {
		this.method = method;
	}

	public ContactCheck(String name, String mail, String tel,String inquiry,int method) {
		this.name = name;
		this.mail = mail;
		this.tel = tel;
		this.inquiry = inquiry;
		this.method = method;
	}
}