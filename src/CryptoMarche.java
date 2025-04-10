import java.util.ArrayList;

public class CryptoMarche
{

	private ArrayList<Portefeuille> portefeuilles;
	private static CryptoMarche marche;

	private CryptoMarche()
	{
		portefeuilles = new ArrayList<Portefeuille>();
	}

	public static CryptoMarche getInstance()
	{
		if (marche == null)
		{
			marche = new CryptoMarche();
		}
		return marche;
	}

	public void ajouter(Portefeuille p)
	{
		// Vérifie si le portefeuille existe déjà
		if (!portefeuilles.contains(p))
		{
			portefeuilles.add(p);
		}
	}

	public void supprimer(Portefeuille p)
	{
		portefeuilles.remove(p);
	}

	/**
	 * Recherche un portefeuille par propriétaire et cryptomonnaie.
	 * 
	 * @param proprietaire
	 *            Nom du propriétaire.
	 * @param monnaie
	 *            Cryptomonnaie recherchée.
	 * @return Le portefeuille correspondant ou null s'il n'existe pas.
	 */
	public Portefeuille rechercherPortefeuille(String proprietaire, Cryptomonnaie monnaie)
	{
		for (Portefeuille portefeuille : portefeuilles)
		{
			if (portefeuille.getProprietaire().equals(proprietaire) && portefeuille.getMonnaie().equals(monnaie))
			{
				return portefeuille;
			}
		}
		return null;
	}

	/**
	 * Cette fonction recherche sur le marché tous les portefeuilles du
	 * propriétaire et calcule son capital en euros.
	 * 
	 * @param proprietaire
	 * @return capital en euros du propriétaire.
	 */
	public double capitalEnEuros(String proprietaire)
	{
		double capitalTotal = 0;

		for (Portefeuille portefeuille : portefeuilles)
		{
			if (portefeuille.getProprietaire().equals(proprietaire))
			{
				capitalTotal += portefeuille.valeurEnEuros();
			}
		}

		return capitalTotal;
	}

	/**
	 * Cette fonction recherche sur le marché tous les portefeuilles d'un type
	 * de devise et calcule le volume total de capital de cette devise sur le
	 * marché.
	 * 
	 * @param monnaie
	 * @return capital total en circulation de la cryptomonnaie (en euros).
	 */
	public double capitalMonneaie(Cryptomonnaie monnaie)
	{
		double volumeTotal = 0;

		for (Portefeuille portefeuille : portefeuilles)
		{
			if (portefeuille.getMonnaie().equals(monnaie))
			{
				volumeTotal += portefeuille.getMontant();
			}
		}

		return volumeTotal * monnaie.getValeurDeJeton();
	}

	@Override
	public String toString()
	{
		StringBuilder ret = new StringBuilder();
		for (Portefeuille p : this.portefeuilles)
		{
			ret.append(p.toString()).append("\n");
		}
		return ret.toString();
	}
}