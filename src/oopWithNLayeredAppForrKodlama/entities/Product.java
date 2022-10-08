package oopWithNLayeredAppForrKodlama.entities;

public class Product {
	private String kategori;
	private String kursBolumleri;
	private String egitmen;
	private int kursFiyati;
	private String kursIsimleri;
	
	
	
	
	
	public Product(String kategori, String kursBolumleri, String egitmen, int kursFiyati, String kursIsimleri) {
		super();
		this.kategori = kategori;
		this.kursBolumleri = kursBolumleri;
		this.egitmen = egitmen;
		this.kursFiyati = kursFiyati;
		this.kursIsimleri = kursIsimleri;
	}

	public String getKursIsimleri() {
		return kursIsimleri;
	}

	public void setKursIsimleri(String kursIsimleri) {
		this.kursIsimleri = kursIsimleri;
	}

	public String getKategori() {
		return kategori;
	}
	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	public String getKursBolumleri() {
		return kursBolumleri;
	}
	public void setKursBolumleri(String kursBolumleri) {
		this.kursBolumleri = kursBolumleri;
	}
	public String getEgitmen() {
		return egitmen;
	}
	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}
	public int getKursFiyati() {
		return kursFiyati;
	}
	public void setKursFiyati(int kursFiyati) {
		this.kursFiyati = kursFiyati;
	}
	
	

}
