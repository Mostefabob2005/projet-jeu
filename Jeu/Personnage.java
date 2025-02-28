

abstract class Personnage implements Attaquable {
	protected String nom;
	protected int pointsDeVie;
	protected int degats; // Dégâts de base
	protected int niveau;
	protected int experience;

	public Personnage(String nom, int pointsDeVie, int degats) {
		this.nom = nom;
		this.pointsDeVie = pointsDeVie;
		this.degats = degats;
		this.niveau = 1;
		this.experience = 0;
	}

	public void recevoirDegats(int degats) {
		pointsDeVie -= degats;
		System.out.println(nom + " a reçu " + degats + " points de dégâts. Points de vie restants : " + pointsDeVie);
	}

	public boolean estVivant() {
		return pointsDeVie > 0;
	}

	public String getNom() {
		return nom;
	}
	public int getPointsdeVie() {
		return pointsDeVie;
	}

	public void gagnerExperience(int xp) {
		int xpmax=100;
		experience += xp;
		if (experience >= xpmax) {
			niveau++;
			experience = 0;
			xpmax=xpmax*2;
			System.out.println(nom + " a atteint le niveau " + niveau + " !");
		}
	}

}
