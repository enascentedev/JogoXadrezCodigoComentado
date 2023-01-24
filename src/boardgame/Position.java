package boardgame;

public class Position {
// classe de posição das peças
	private int row;
	// linha
	private int column;
	//coluna, são privados para adotar a pratica de encapsulamento
	
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
		//aqui foi feito o método construtor
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
		// uso do ToString sobreescrevendo o método da classe object
	}
}
