package models;

import interfaces.PredateurAction;

public abstract class Predateur implements PredateurAction {

	private int force ;
	private CategorieAge categorieAge;
	private Nourriture nourriture;
	private GroupeSolitaire groupeSolitaire;
	private Sexe sexe;
	
	
	
	enum GroupeSolitaire {groupe ,solitaire };
	enum Nourriture {viande,omnivore};
	enum CategorieAge {jeune , adulte, vieux };	
	enum Sexe {femelle,male}
	
	public Predateur() {
	}
	
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
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
	
	@Override
	public String toString() {
		return "Predateur [force=" + force + ", categorieAge=" + categorieAge + ", nourriture="
				+ nourriture + ", groupeSolitaire=" + groupeSolitaire + ", sexe=" + sexe + "]";
	}
}
