import java.util.Random;

public class Game {
	public static Ludo ludo;
	public Player players[];
	public static Constants.GameState state;
	
	public void initPlayers(int count) {
		players = new Player[count+1];
		for(int i=1;i<=count;i++) {
			players[i] = new Player(0,i);
		}		
	}
	
	public void initSnake(int [][]snakes) {
		for(int i=0;i<snakes.length;i++) {
			Squares square = ludo.getSquareInstance(snakes[i][0]);
			square.setTargetPosition(snakes[i][1]);
			square.setHasSnake(true);
		}
	}
	
	public void initLadders(int [][]ladders) {
		for(int i=0;i<ladders.length;i++) {
			Squares square = ludo.getSquareInstance(ladders[i][0]);
			square.setTargetPosition(ladders[i][1]);
			square.setHasLadder(true);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game= new Game();
		game.ludo= new Ludo(10);
		int snakes[][]= new int[][]{{99,2},{90,10},{50,35},{79,40},{25,5}};
		int ladders[][]= new int[][]{{5,40},{15,89},{70,85},{20,48},{61,97}};
		game.initSnake(snakes);
		game.initLadders(ladders);
		game.initPlayers(3);
		game.startGame();
	}
	
	public void startGame() {
		state = Constants.GameState.STARTED;
		int playersCount = players.length;
		int maxPos = ludo.getSize()*ludo.getSize();
		
		while(state!= Constants.GameState.WON) {
			for(int i=1;i<playersCount;i++) {
				System.out.print( "Player : " +i);
				Random r= new Random();
				int steps = (r.nextInt(6)+1);
				int curPos= players[i].getPosition();
				int newPos= curPos+steps;
				int targetPos=newPos;
				if(newPos <= maxPos) {
					Squares newPosSquare = ludo.getSquareInstance(newPos);
					targetPos = newPosSquare.getTargetPosition();
					players[i].setPosition(targetPos);
					System.out.println("Number on dice = "+steps+ " old position = "+curPos+ " new position = "+targetPos);
					if(targetPos==maxPos) {
						state=Constants.GameState.WON;
						System.out.println("Game Won by Player : "+ i);
						break;
					}
				}
				//System.out.println("New Position = "+targetPos);
			}
		}
	}
}
