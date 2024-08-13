package controller;

/* 
 * 3. Construir uma função recursiva que receba um vetor e seu tamanho e apresente a quan�dade de
números pares existentes no vetor. Considere que a entrada deve ser, apenas de números naturais
diferentes de zero.
 */

public class recursvidadeController {

	public recursvidadeController() {
		
	}
	
	public int vetorMostraPares( int[] vetor, int tamanho){
		if (tamanho >= 0) {
			if (vetor[tamanho]%2 == 0) {
				return 1 + vetorMostraPares(vetor , tamanho-1);
			}
			return vetorMostraPares(vetor, tamanho-1);
		}
		else {
			return 0;
		}
	}
	
}
