import java.util.ArrayList;

public class Percorso {
	CittaNodo campoBase;
	CittaNodo cittaFinale;
    double carburanteSpeso;
    ArrayList<CittaNodo> cittaToccate = new ArrayList<>();
    Veicolo mezzoUtilizzato;
    Mappa mappa;
    
    //costruttore che prende solo un veicolo e che imposta il resto a null
    public Percorso(CittaNodo campoBase, CittaNodo cittaFinale, Mappa mappa,
			Veicolo mezzoUtilizzato) {
		this.campoBase = campoBase;
		this.cittaFinale = cittaFinale;
		this.mappa = mappa;
		this.mezzoUtilizzato = mezzoUtilizzato;
		this.cittaToccate = trovaCitta(); 
		this.carburanteSpeso = calcolaDistanza();
		
	}
    
    // metodo che data la CittaNodo campoBase e la CittaNodo a cui 
    // si vuole arrivare ti ritorna una lista che contiene le citta toccate
    private ArrayList<CittaNodo> trovaCitta() {
    	ArrayList<CittaNodo> cittaToccate = new ArrayList<CittaNodo>();
    	
		return cittaToccate;
	}

	/**
     * metodo per calcolo della distanza totale in base al tipo di mezzo
     * @return la distanza che sara' poi utilizzata per settare l'attributo carburanteSpeso
     *
     */
    public double calcolaDistanza() {
    	double distanza = mezzoUtilizzato.calcolaDistanza(campoBase, cittaToccate.get(0));
    	for(int i = 1; i < cittaToccate.size() - 1; i++)
    		distanza += mezzoUtilizzato.calcolaDistanza(cittaToccate.get(i), cittaToccate.get(i + 1));
    	return distanza;
    }


	
   
    
    //metodi setters e getters

    /*
    * campo base: 1 2 3
    * citta 2: 4 6 3*/

}
