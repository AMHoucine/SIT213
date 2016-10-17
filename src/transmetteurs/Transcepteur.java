package transmetteurs;

/**
 * Classe Transcepteur qui s'occuppe de conserver en commun les attributs :
 * - nbEchantillon, le nombre d'�chantillon par bit
 * - min et max les valeurs limites du signal analogique
 * @param <R> Type de l'information en r�ception
 * @param <E> Type de l'information en �mission
 */
public abstract class Transcepteur<R, E> extends Transmetteur<R, E> {
	protected int nbEchantillon;
	protected float min;
	protected float max;
	
	/**
	 * Constructeur de la classe Transcepteur.
	 * S'occupe d'attribuer les valeurs pass�es en arguments aux attributs de la classe
	 * @param min amplitude minimale du signal
	 * @param maxamplitude maximale du signal
	 * @param nbEchantillon le nombre d'�chantillons par bit
	 */
	public Transcepteur(float min, float max, int nbEchantillon){
		this.nbEchantillon = nbEchantillon;
		this.min = min;
		this.max = max;
	}
}
