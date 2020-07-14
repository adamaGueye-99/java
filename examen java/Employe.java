package Log;

import java.io.IOException;

public class Employe {
	private int Id;
	private String nomComplet;
	
	

	public Employe(int I,String nC)throws IOException{
		this.Id=I;
		this.nomComplet=nC;
		System.out.println("Employe ajouté");
	
	}
	 
	
}


