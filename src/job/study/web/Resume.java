package job.study.web;

public class Resume {
	
	private String name;
	private String[] duties;
	private String career;
	private String salary;
	private String introduce;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String[] getDuties() {
		return duties;
	}
	public void setDuties(String[] job) {
		this.duties = job;
	}
	public String getCareer() {
		return career;
	}
	public void setCareer(String career) {
		this.career = career;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public String getIntroduce() {
		return introduce;
	}
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
 
}
