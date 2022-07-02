package bean;


public class User {
		
		private int userid;
		
		private String name;
		
		private String mail;
		
		private String tel;
		
		public int getId() {
			return userid;
		}
		
		public void setId(int id) {
			this.userid = id;
		}
		
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

		public User(int id, String name, String mail, String tel) {
			this.userid = id;
			this.name = name;
			this.mail = mail;
			this.tel = tel;
		}
}
