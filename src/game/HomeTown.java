package game;
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
public class HomeTown extends BasicGameState{
	public HomeTown(int state){
		
	}
	
	public void init(GameContainer arg0, StateBasedGame arg1) throws SlickException {
		// TODO Auto-generated method stub
		Image[] walkUp = {new Image("res/sprites/penaisBack1.png"), new Image("res/sprites/penaisBack2.png")};
		Image[] walkDown = {new Image("res/sprites/penaisFront1.png"), new Image("res/sprites/penaisFront2.png")};
		Image[] walkLeft = {new Image("res/sprites/penaisLeft1.png"), new Image("res/sprites/penaisLeft2.png")};
		Image[] walkRight = {new Image("res/sprites/penaisRight1.png"), new Image("res/sprites/penaisRight2.png")};
		Image[] front = {new Image("res/sprites/penaisFront.png")};
		Image[] back = {new Image("res/sprites/penaisBack.png")};
		Image[] left = {new Image("res/sprites/penaisLeft.png")};
		Image[] right = {new Image("res/sprites/penaisRight.png")};
		
		//Animations
		game.variables.penaisFront = new Animation(front, 100);
		game.variables.penaisBack = new Animation(back, 100);
		game.variables.penaisLeft = new Animation(left, 100);
		game.variables.penaisRight = new Animation(right, 100);
		game.variables.movingUp = new Animation(walkUp, game.variables.duration);
		game.variables.movingDown = new Animation(walkDown, game.variables.duration);
		game.variables.movingLeft = new Animation(walkLeft, game.variables.duration);
		game.variables.movingRight = new Animation(walkRight, game.variables.duration);
		game.variables.sprintingDown = new Animation(walkDown, game.variables.sprintDuration);
		game.variables.sprintingUp = new Animation(walkUp, game.variables.sprintDuration);
		game.variables.sprintingLeft = new Animation(walkLeft, game.variables.sprintDuration);
		game.variables.sprintingRight = new Animation(walkRight, game.variables.sprintDuration);
		game.variables.penai = game.variables.penaisFront;

	}

	
	public void render(GameContainer arg0, StateBasedGame arg1, Graphics arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	
	public void update(GameContainer arg0, StateBasedGame arg1, int arg2) throws SlickException {
		// TODO Auto-generated method stub
		
	}

	
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
