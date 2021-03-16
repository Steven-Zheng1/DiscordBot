package alpha;

import javax.security.auth.login.LoginException;

//import java.util.Scanner;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class botAlpha {
	
	//main method
	public static void main(String[] args) {
		
		JDABuilder jda = JDABuilder.createDefault("NzA3NzA3MzA5NTM4NjcyNzUw.XxeYmw.fXWOtZKsI_9DC2vQc6TOkh5HyAs");
		JDA api = null; //null to prevent an error
		Command status = new Command();jda.addEventListeners(status); //execute the command from another file
		
		try {
			api = jda.build();
		}
		catch (LoginException e) {
			e.printStackTrace();
		}
		//api.addEventListener(status);
		
		//String token = "NzA3NzA3MzA5NTM4NjcyNzUw.XxeYmw.fXWOtZKsI_9DC2vQc6TOkh5HyAs";
		
		
		
		//api.getPresence().setStatus(OnlineStatus.ONLINE);
		//api.getPresence().setActivity(Activity.playing("Getting Over it"));
		
		//jda.addEventListener(new Commands());
		
		//Scanner scanner1 = new Scanner(System.in);
		//String stop = scanner1.nextLine();
		//if (stop == "stop") {
			//jda.shutdown();
		//}
		//else
			//System.out.println("Please re-enter.");
			
	}

}
