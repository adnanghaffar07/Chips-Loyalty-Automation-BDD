package Constants;

public class Constants {
	public String myEnvVariable = System.getProperty("MY_ENV");
	public static String url;
	public static String Username;
	public static String Password ;
	
	public Constants() {
//Staging Env
		this.url="https://stagingatlas.pharma.solutions/login";
		this.Username="qaautomation@pharma.solutions";
		this.Password="Test@1234";		
		
		if(this.myEnvVariable != null && this.myEnvVariable.equals("dev")) {
//Dev Env 
			this.url="https://dev-newfeature.lha.pharma.solutions";
			this.Username="qaautomation@pharma.solutions";
			this.Password="WGqb6xmV#1";
			System.out.println("Dev Env:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: "+this.url);
		}else if (this.myEnvVariable != null && this.myEnvVariable.equals("qa")) {
//QA Env 
			this.url="https://qa-maintenance.lha.pharma.solutions/";
			this.Username="qaautomation@pharma.solutions";
			this.Password="WGqb6xmV#1";
			System.out.println("QA Env:>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>: "+this.url);
		}
	}

	public static String outlookUrl = "https://outlook.live.com/owa/";
	public static String outlookUsername = "qaautomation@pharma.solutions";
	public static String outlookPassword = "WGqb6xmV#2";	
}
