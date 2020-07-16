
public class Squares {
	private int mNumber;
	private boolean mHasSnake;
	private boolean mHasLadder;
	private int mTargetPosition;
	
	Squares(int number) {
		mNumber = number;
		mTargetPosition = number;
		mHasSnake = false;
		mHasLadder = false;
	}

	public int getNumber() {
		return mNumber;
	}

	public void setNumber(int mNumber) {
		this.mNumber = mNumber;
	}

	public boolean isHasSnake() {
		return mHasSnake;
	}

	public void setHasSnake(boolean mHasSnake) {
		this.mHasSnake = mHasSnake;
	}

	public boolean isHasLadder() {
		return mHasLadder;
	}

	public void setHasLadder(boolean mHasLadder) {
		this.mHasLadder = mHasLadder;
	}

	public int getTargetPosition() {
		return mTargetPosition;
	}

	public void setTargetPosition(int mTargetPosition) {
		this.mTargetPosition = mTargetPosition;
	}
	
}
