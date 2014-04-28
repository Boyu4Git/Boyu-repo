import java.io.File;


public class Profile {
	private String name;
	private String url;
	File localFile;
	private String company="";
	//those attributes below are all used to calculate percentage
	private int hasCompany=0;
	private int hasTitle=0;
	private int hasExpPeriod=0;
	private int hasMajor=0;
	private int hasDegree=0;
	private int hasEduPeriod=0;
	private int hasEdu=0;
	public int getHasEdu() {
		return hasEdu;
	}
	public void setHasEdu() {
		this.hasEdu = 1;
	}
	public int getHasEduPeriod() {
		return hasEduPeriod;
	}
	public void setHasEduPeriod() {
		this.hasEduPeriod = 1;
	}
	public int getHasCompany() {
		return hasCompany;
	}
	public void setHasCompany() {
		this.hasCompany = 1;
	}
	
	public int getHasTitle() {
		return hasTitle;
	}
	public void setHasTitle() {
		this.hasTitle = 1;
	}
	public int getHasExpPeriod() {
		return hasExpPeriod;
	}
	public void setHasExpPeriod() {
		this.hasExpPeriod = 1;
	}
	public int getHasMajor() {
		return hasMajor;
	}
	public void setHasMajor() {
		this.hasMajor = 1;
	}
	public int getHasDegree() {
		return hasDegree;
	}
	public void setHasDegree() {
		this.hasDegree = 1;
	}
	
	public String getCompany() {
		return company;
	}
	public void updateCompany(String company) {
		this.company = this.company+"|"+company;
	}
	String education="";
	public String getEducation() {
		return education;
	}
	public void updateEducation(String education) {
		this.education =this.education+"|"+education;
	}
	Profile(String name, String url,File localFile){
		this.name=name;
		this.url=url;
		this.localFile=localFile;
	}
	 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return "|"+name+getCompany()+getEducation();
	}

}
