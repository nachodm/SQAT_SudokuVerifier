import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293 -
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891  -
	
	
	@Test
	public void testHasNegativeNumbersOrCointainsALetter() {
		String test = "41736-1825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-1, SudokuVerifier.verifyPositiveNumbers(test));
	}
	
	@Test
	public void testPositiveNumbersAndNoLetters() {
		String test = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.verifyPositiveNumbers(test));
	}

	@Test
	public void testValidRows() {
		String test = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.verifyRows(test));
	}
	
	@Test
	public void testInvalidRows() {
		String test = "417349825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(-3, SudokuVerifier.verifyRows(test));
	}
	@Test
	public void testValidCols() {
		String test = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
		assertEquals(0, SudokuVerifier.verifyCols(test));
	}
	@Test
	public void testInvalidCols() {
		String test = "417369825632158947958724316825437169791586432346912758289643571573291684464875293";
		assertEquals(-4, SudokuVerifier.verifyCols(test));
	}
}
