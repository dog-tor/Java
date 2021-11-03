package drop;

import org.osbot.rs07.script.Script;
import org.osbot.rs07.script.ScriptManifest;

import java.awt.*;


@ScriptManifest(name = "dropper", author = "dog-tor", version = 0.1, info = "", logo = "") 
public class main extends Script {




    @Override
    public void onStart() {
        //Code here will execute before the loop is started
    	log("Welcome to my script!!!");
    	
    }
    
    private enum State {
		DROP, WAIT
	};
	
	private State getState() {
		if (!inventory.isEmpty())
			return State.DROP;
		return State.WAIT;
	}
 
    @Override
    public int onLoop() throws InterruptedException {
		log("Running onLoop...");
		switch (getState()) {

		case DROP:
			inventory.dropAll();
			log("Dropping...");
			break;
		case WAIT:
			log("Waiting...");
			sleep(random(50, 60));
			break;
		}
		return random(200, 300);
	}

    @Override
    public void onExit() {
        //Code here will execute after the script ends
    	log("Thank you for using my script!!!");
    	
    }

    @Override
    public void onPaint(Graphics2D g) {
        //This is where you will put your code for paint(s)




    }


}
