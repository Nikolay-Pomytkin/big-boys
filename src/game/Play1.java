package game;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Play1 extends BasicGameState {
	//Animations
	public Animation antonina, antoninaRight, antoninaLeft;
	//Images
	Image lvlOneMap;
	Image menuBackground;
	//Counters
	int antoninaMovementCounter = 0;
	boolean movingright = true;
	//Positions
	float shiftX = game.variables.penaiPosX + 540;
	float shiftY = game.variables.penaiPosY + 360;
	
	public Play1(int state){
		
	}
	
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {
		// Images
		menuBackground = new Image("res/backgrounds/menuBackground.png");
		lvlOneMap = new Image("res/levelMap/lvlOneMap.png");
		Image[] walkUp = {new Image("res/sprites/penaisBack1.png"), new Image("res/sprites/penaisBack2.png")};
		Image[] walkDown = {new Image("res/sprites/penaisFront1.png"), new Image("res/sprites/penaisFront2.png")};
		Image[] walkLeft = {new Image("res/sprites/penaisLeft1.png"), new Image("res/sprites/penaisLeft2.png")};
		Image[] walkRight = {new Image("res/sprites/penaisRight1.png"), new Image("res/sprites/penaisRight2.png")};
		Image[] front = {new Image("res/sprites/penaisFront.png")};
		Image[] back = {new Image("res/sprites/penaisBack.png")};
		Image[] left = {new Image("res/sprites/penaisLeft.png")};
		Image[] right = {new Image("res/sprites/penaisRight.png")};
		Image[] antoninaRightImg = {new Image("res/sprites/antoninasRight1.png"), new Image("res/sprites/antoninasRight2.png")};
		Image[] antoninaLeftImg = {new Image("res/sprites/antoninasLeft1.png"), new Image("res/sprites/antoninasLeft2.png")};
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
		antoninaRight = new Animation(antoninaRightImg, game.variables.antoninaDuration);
		antoninaLeft = new Animation(antoninaLeftImg, game.variables.antoninaDuration);
		game.variables.penai = game.variables.penaisFront;
		antonina = antoninaRight;

	}

	public void render(GameContainer gc, StateBasedGame sbg, Graphics gfx) throws SlickException {
		// Drawing images
		lvlOneMap.draw(game.variables.penaiPosX-41, game.variables.penaiPosY+28);
		game.variables.penai.draw(shiftX, shiftY);
		antonina.draw(game.variables.antoninaPosX, game.variables.antoninaPosY);
		menuBackground.draw(game.variables.menuPositionX, game.variables.menuPositionY);
		// Drawing X and Y Positions
		gfx.drawString("X: "+ game.variables.penaiPosX + "\nY: " + game.variables.penaiPosY, 450, 20);
	}

	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		//code for Antonina Bot
		//antonina moving right
		if(movingright == true){
			antonina = antoninaRight;
			game.variables.antoninaPosX += delta *.1f;
			antoninaMovementCounter++;
			if(antoninaMovementCounter > 1000){
				movingright = false;
			} 
		}
		//antonina moving left
		if(movingright == false){
			antonina = antoninaLeft;
			game.variables.antoninaPosX -= delta * .1f;
			antoninaMovementCounter--;
			if(antoninaMovementCounter < 0){
				movingright = true;
			}
		}
		// code for movement
		Input input = gc.getInput();
		game.functions.movement(delta, input);
		QuadSpace topwall = new QuadSpace(-120,650,230,999);
		topwall.collide(input, delta);
		game.functions.setCollision(input, delta, -80, -75, -120, 230, "right");	//right wall
		game.functions.setCollision(input, delta, 570, 999, -120, 999, "left");     //left wall
		game.functions.setCollision(input, delta, -80, 570, -999, -115, "down");	//bottom wall
		//pause menu
		game.functions.menu(input);
	}

	public int getID() {
		return 4;
	}

}