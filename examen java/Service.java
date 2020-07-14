package Log;
import java.io.FileWriter;
import java.io.IOException;

public class Service {
	public int id;
	public String libelle;
	
	public Service(int I,String L) throws IOException{
		this.id=I;
		this.libelle=L;
		System.out.println("Service ajouté");
	}
	
	public void affiche(int I,String L){
		this.id=I;
		this.libelle=L;
		System.out.println(I + L);
		}
	
	
	
}
