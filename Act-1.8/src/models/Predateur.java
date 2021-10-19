package models;

public abstract class Predateur {

	private int force ;
	private Son son;
	private CategorieAge categorieAge;
	private Nourriture nourriture;
	private GroupeSolitaire groupeSolitaire;
	private Sexe sexe;
	
	
	enum GroupeSolitaire {groupe ,solitaire };
	enum Nourriture {viande,omnivore};
	enum CategorieAge {jeune , adulte, vieux };	
	enum Son {rugit,hurle};
	enum Sexe {femelle,male}
	
	
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public Son getSon() {
		return son;
	}
	public void setSon(Son son) {
		this.son = son;
	}
	public CategorieAge getCategorieAge() {
		return categorieAge;
	}
	public void setCategorieAge(CategorieAge categorieAge) {
		this.categorieAge = categorieAge;
	}
	public Nourriture getNourriture() {
		return nourriture;
	}
	public void setNourriture(Nourriture nourriture) {
		this.nourriture = nourriture;
	}
	public GroupeSolitaire getGroupeSolitaire() {
		return groupeSolitaire;
	}
	public void setGroupeSolitaire(GroupeSolitaire groupeSolitaire) {
		this.groupeSolitaire = groupeSolitaire;
	}
	public Sexe getSexe() {
		return sexe;
	}
	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	};
}
