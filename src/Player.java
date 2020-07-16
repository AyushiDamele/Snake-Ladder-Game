
public class Player {
	int mPosition;
	int mId;
	
	Player(int position, int id) {
		mPosition = position;
		mId= id;
	}

	public int getPosition() {
		return this.mPosition;
	}

	public void setPosition(int mPosition) {
		this.mPosition = mPosition;
	}

	public int getId() {
		return this.mId;
	}

	public void setId(int mId) {
		this.mId = mId;
	}
	
	

}
