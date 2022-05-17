package application;

import chess.ChessMatch;

public class Program {
	public static void main(String[] args) {
		var chessMatch = new ChessMatch();

		UI.printBoard(chessMatch.pieces());
	}
}
