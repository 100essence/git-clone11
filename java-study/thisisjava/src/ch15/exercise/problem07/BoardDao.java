package ch15.exercise.problem07;

import java.util.*;

@SuppressWarnings("")
public class BoardDao {

	@SuppressWarnings("")
	public List<Board> getBoardList() {
		int a = 0;
		List<Board> listBoard = new ArrayList<>();
		listBoard.add(new Board("제목1", "내용1"));
		listBoard.add(new Board("제목2", "내용2"));
		listBoard.add(new Board("제목3", "내용3"));
		
		return listBoard;
	}
}
