package job.study.web;

public class Member {
	private String userId;
	private String passwd;
	private String email;
	private String hp_1;
	private String hp_2;
	private String emailAgree; //라디오
	private String[] interest; //체크박스
	private String introduce;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHp_1() {
		return hp_1;
	}
	public void setHp_1(String hp_1) {
		this.hp_1 = hp_1;
	}
	public String getHp_2() {
		return hp_2;
	}
	public void setHp_2(String hp_2) {
		this.hp_2 = hp_2;
	}
	public String getEmailAgree() {
		return emailAgree;
	}
	public void setEmailAgree(String emailAgree) {
		this.emailAgree = emailAgree;
	}
	public String[] getInterest() {
		return interest;
	}
	public void setInterest(String[] interest) {
		this.interest = interest;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}	
	
	
	
	
}
