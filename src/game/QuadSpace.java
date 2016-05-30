package game;
import org.newdawn.slick.*;
public class QuadSpace {
<<<<<<< HEAD
	static int x1; //smaller value
	static int x2; //larger value
	static int y1; //smaller value
	static int y2; // larger value
=======
	int x1; //smaller value
	int x2; //larger value
	int y1; //smaller value
	int y2; // larger value
>>>>>>> 3966c900a428e5dbd06c6573f30ed33e47d9a278
	public QuadSpace(int xa, int xb, int ya, int yb){
		x1 = xa;
		x2 = xb;
		y1 = ya;
		y2 = yb;
	}
	public void collide(Input i, int delta){
		if(game.variables.penaiPosX > x1 && game.variables.penaiPosX < x2 && game.variables.penaiPosY > y1 && game.variables.penaiPosY < y2){
			if(i.isKeyDown(Input.KEY_W)){
				game.variables.penaiPosY -= .2f * delta;
<<<<<<< HEAD
				game.variables.antoninaPosY -= .2f * delta;
				if(i.isKeyDown(Input.KEY_B)){
					game.variables.penaiPosY -= .2f * delta;
					game.variables.antoninaPosY -= .2f * delta;
				}
			}
			if(i.isKeyDown(Input.KEY_S)){
				game.variables.penaiPosY += .2f * delta;
				game.variables.antoninaPosY += .2f * delta;
				if(i.isKeyDown(Input.KEY_B)){
					game.variables.penaiPosY += .2f * delta;
					game.variables.antoninaPosY += .2f * delta;
				}
			}
			if(i.isKeyDown(Input.KEY_A)){
				game.variables.penaiPosX -= .2f * delta;
				game.variables.antoninaPosX -= .2f * delta;
				if(i.isKeyDown(Input.KEY_B)){
					game.variables.penaiPosX -= .2f * delta;
					game.variables.antoninaPosX -= .2f * delta;
				}
			}
			if(i.isKeyDown(Input.KEY_D)){
				game.variables.penaiPosX += .2f * delta;
				game.variables.penaiPosX += .2f * delta;
				if(i.isKeyDown(Input.KEY_B)){
					game.variables.penaiPosX += .2f * delta;
					game.variables.antoninaPosX += .2f * delta;
				}
=======
				if(i.isKeyDown(Input.KEY_B))
					game.variables.penaiPosY -= .2f * delta;
			}
			if(i.isKeyDown(Input.KEY_S)){
				game.variables.penaiPosY += .2f * delta;
				if(i.isKeyDown(Input.KEY_B))
					game.variables.penaiPosY += .2f * delta;
			}
			if(i.isKeyDown(Input.KEY_A)){
				game.variables.penaiPosX -= .2f * delta;
				if(i.isKeyDown(Input.KEY_B))
					game.variables.penaiPosX -= .2f * delta;
			}
			if(i.isKeyDown(Input.KEY_D)){
				game.variables.penaiPosX += .2f * delta;
				if(i.isKeyDown(Input.KEY_B))
					game.variables.penaiPosX += .2f * delta;
>>>>>>> 3966c900a428e5dbd06c6573f30ed33e47d9a278
			}
		}
	}
}