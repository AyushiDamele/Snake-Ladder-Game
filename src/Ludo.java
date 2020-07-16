public class Ludo {
	int mSize;
	Squares square[];
	Ludo(int size) {
		mSize = size;
		square = new Squares[size*size+1];
		for(int i=1;i<=size*size ;i++) {
			square[i]= new Squares(i);
		}
	}
	
	public int getSize() {
		return mSize;
	}
	
	public Squares getSquareInstance(int index) {
		return this.square[index];
	}
}