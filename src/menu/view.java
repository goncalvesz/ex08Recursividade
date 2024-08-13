package menu;

import javax.swing.JOptionPane;

import controller.recursvidadeController;

public class view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		recursvidadeController recursiva = new recursvidadeController();
		
		int[] vetor = {1,2,3,4,5,6,7,8,9,10};
		
		JOptionPane.showMessageDialog(null, "Numeros de pares no vetor = " + recursiva.vetorMostraPares(vetor, vetor.length-1));
		
	}

}
