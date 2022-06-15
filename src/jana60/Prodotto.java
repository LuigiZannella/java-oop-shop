package jana60;

import java.text.DecimalFormat;

public class Prodotto {
	
	/*	Esercizio di stamattina Java Shop
    Nome repo: java-oop-shop
	Stiamo lavorando per un sito di e-commerce e dobbiamo gestirne i prodotti.
	Consegna:
	Nel progetto java-oop-shop, package jana60.shop e creare la classe Prodotto che gestisce i prodotti dello shop.
	Un prodotto è caratterizzato da:
	marca
	nome
	prezzo
	iva
	Scegliere opportunamente il tipo di dato per gli attributi
	Aggiungere un costruttore che inizializza tutti gli attributi.
	Aggiungere dei metodi per:
	calcolare il prezzo comprensivo di iva
    formattare il prezzo restituendo una stringa con un determinato numero di decimali e il carattere € */
	
	public static void main(String[] args) {
	
	}
	
	DecimalFormat df= new DecimalFormat ("#.00");
	
	String nome, marca;
	int iva;
	float prezzo;
	public Prodotto(String nome, String marca, int iva, float prezzo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.iva = iva;
		this.prezzo = prezzo;
	}
	
	public float prezzoTotale() {
		return prezzo + ((prezzo /100) * iva);
	}
	
	
	public String toString() {
	
	    return "Il prezzo del prodotto " +nome+ " di marca " +marca+ "è: " + df.format(prezzoTotale());
	

}
	
}
