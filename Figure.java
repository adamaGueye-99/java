public abstract class Figure{

	//attributs
		//Instance
		 protected double longueur;
		//Classe
		protected static String unite;
	//M�thodes
	  //Constructeur: est une m�thode qui porte le meme nom que la classe et n'a pas de type
	 //de retour
	    //Constructeur par d�faut
	public Figure(){
	}
	//Getters et  Setters=> toujours methodes concr�tes, m�thodes Instances ou methodes
	//Classes
	  //Getters et Setters de longueur
		public double getLongueur(){
		    return this.longueur;
	}

		public void setLongueur(double longueur){
		     this.longueur=longueur;
	}




	  //Getters et Setters de unite
		public static String getUnite(){
		    return unite;
	}

		public static void  setUnite(String unite){
		     Figure.unite=unite;
	}

       //metiers
	public abstract double demiPerimetre();
	
	public  double perimetre(){
		demiPerimetre()*2;
	}

	public  abstract double surface();
	public  abstract double diagonale();
