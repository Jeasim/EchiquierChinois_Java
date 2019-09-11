package xiangqi;

public class Elephant extends Piece
{	
	public Elephant(String nom, String couleur)
	{
		super(nom,couleur);
	}
	
	public boolean estValide(Position depart, Position arrivee)
	{
		String couleur = getCouleur();
		int ligneArrivee = arrivee.getLigne();
		
		
		if(norme(depart, arrivee) == 8 || norme(depart, arrivee) == 0)		//d�placement de deux cases en diagonales, ou un d�placement de 0
		{
			if(couleur == "noir" && (ligneArrivee <= 4))					//c�t� nord de la rivi�re (ne peut �tre d�pass�)
					return true;
			
			else if(couleur == "rouge" && (ligneArrivee >= 5))				//c�t� sud de la rivi�re (ne peut �tre d�plac�)
					return true;
			
			else 
				return false;
		}
		else
			return false;
		
	}
	
	
}
