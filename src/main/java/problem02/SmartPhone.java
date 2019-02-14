package problem02;

public class SmartPhone extends MusicPhone {
	
	public String runApp() {
		return null;
	}
	public void execute( String function ) {
		if (function.equals("음악")) {
			System.out.println(playMusic());
			return;
		}
		else if(function.equals("앱")) {
			System.out.println("앱실행");
			return;
		}
			
		
		super.execute(function);
	}
	
	public String playMusic() {
		return "스트리밍";
	}
}