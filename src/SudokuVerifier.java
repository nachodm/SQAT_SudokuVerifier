
public class SudokuVerifier {
	
	public int verify(String candidateSolution) {
		
		for(int i = 0; i < candidateSolution.length(); i++) {
			char [] sudoku = candidateSolution.toCharArray();
			if (sudoku[i] < 0) {
				return -1;
			}
		}
		// returns 0 if the candidate solution is correct
		
		
		
		return 0;
		
		//check
	}
}
