package com.example.tictactoepuppy;

import java.util.Random;


public class StepCalculator {
	
	private int place;
	private int diffLevel;
	
	public int place(int[] array, int diffLevel){

		place = 10;
		for (int turn = 2; turn > 0; turn--) {
			for (int i = 0; i < array.length; i++) {
				if (array[i] == 0) {
					switch(i) {
						case 0:
							if (array[4] == turn && array[8] == turn) {
								place = i;
							}
							else if (array[1] == turn && array[2] == turn) {
								place = i;
							}
							else if (array[3] == turn && array[6] == turn) {
								place = i;
							}
							break;
						case 1:
							if (array[0] == turn && array[2] == turn) {
								place = i;
							}
							else if (array[4] == turn && array[7] == turn) {
								place = i;
							}	
							break;
						case 2:
							if (array[0] == turn && array[1] == turn) {
								place = i;
							}
							else if (array[4] == turn && array[6] == turn) {
								place = i;
							}
							else if (array[5] == turn && array[8] == turn) {
								place = i;
							}		
							break;
						case 3:
							if (array[0] == turn && array[6] == turn) {
								place = i;
							}
							else if (array[4] == turn && array[5] == turn) {
								place = i;
							}	
							break;
						case 4:
							if (array[0] == turn && array[8] == turn) {
								place = i;
							}
							else if (array[2] == turn && array[6] == turn) {
								place = i;
							}
							break;
						case 5:
							if (array[3] == turn && array[4] == turn) {
								place = i;
							}
							else if (array[2] == turn && array[8] == turn) {
								place = i;
							}		
							break;
						case 6:
							if (array[0] == turn && array[3] == turn) {
								place = i;
							}
							else if (array[4] == turn && array[2] == turn) {
								place = i;
							}
							else if (array[7] == turn && array[8] == turn) {
								place = i;
							}
							break;
						case 7:
							if (array[1] == turn && array[4] == turn) {
								place = i;
							}
							else if (array[6] == turn && array[8] == turn) {
								place = i;
							}
							break;
						case 8:
							if (array[0] == turn && array[4] == turn) {
								place = i;
							}
							else if (array[6] == turn && array[7] == turn) {
								place = i;
							}
							else if (array[2] == turn && array[5] == turn) {
								place = i;
							}
							break;
					 }
					if (place != 10) {
						return place;
					}
				}
			}
		}
		if (diffLevel == 3) {
			if (array[0] == 2 && array[8] == 0) {
				place = 8;
			}
			else if (array[2] == 2 && array[6] == 0) {
				place = 6;
			}
			else if (array[6] == 2 && array[2] == 0) {
				place = 2;
			}
			else if (array[8] == 2 && array[0] == 0) {
				place = 0;
			}
			else if (array[4] == 2) {
				if (array[8] == 2 && array[6] == 0) {
					place = 6;
				}
				else if (array[6] == 2 && array[8] == 0) {
					place = 8;
				}		
				else if (array[2] == 2 && array[0] == 0) {
					place = 0;
				}					
				else if (array[0] == 2 && array[2] == 0) {
					place = 2;
				}					
			}
			else if (array[4] == 0) {
				if ((array[0] == 2 || array[8] == 2) && (array[2] == 2 || array[6] == 2)) { 
					place = 4;
				}
			}
			if (place != 10) {
				return place;
			}
		}
		Random rand = new Random();
		place = rand.nextInt(9);
		while (array[place] != 0) {
			place = rand.nextInt(9);
		}
		return place;
		}
}