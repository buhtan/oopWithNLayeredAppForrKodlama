package oopWithNLayeredAppForrKodlama.business;

import core.logging.Logger;
import oopWithNLayeredAppForrKodlama.dataAccess.ProductDao;
import oopWithNLayeredAppForrKodlama.entities.Product;

public class productManager {
	
	private ProductDao dao;
	private Logger[] loggers;
	private Product kurs[]=new Product[] {};
	
	


	public productManager(ProductDao dao, Logger[] loggers) {
		super();
		this.dao = dao;
		this.loggers = loggers;
	}


	public void add(Product product) throws Exception {
		if(product.getKursFiyati()<0) {
			throw new Exception("Geçersiz kurs ücreti");
		}
		for (int i=0;i<kurs.length;i++) {
			if(kurs[i].getKategori() ==product.getKategori() && kurs[i].getKursIsimleri()==product.getKursIsimleri())
			{
				throw new Exception("Kurs isimleri veya kurs katagorileri aynı olamaz");
			}
			kurs[i+1]=product;
			
		}
		
		dao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getEgitmen());
			
		}
		
	};

}
