package org.zefiro.algoritmi.polimorfismo;

public class BandTest {

	public static void main(String[] args) {

		Fask fask = new Fask();
		GazeboPenguins gazebo = new GazeboPenguins();
		
		fask.suona();
		fask.calcolaDischi(5);
		
		System.out.println("");
		
		gazebo.suona();
		gazebo.calcolaDischi(4);

	}

}
