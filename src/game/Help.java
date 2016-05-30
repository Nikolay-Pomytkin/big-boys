package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Help extends BasicGameState{
	
	Image help;
	
	public Help(int state){
	
	}
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		help = new Image("res/backgrounds/help.png");
	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics gfx) throws SlickException {
		help.draw(0,0);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
	}

	public int getID() {
		return 3;
	}
}
