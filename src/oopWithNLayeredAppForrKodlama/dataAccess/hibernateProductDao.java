package oopWithNLayeredAppForrKodlama.dataAccess;

import oopWithNLayeredAppForrKodlama.entities.Product;

public class hibernateProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getKategori()+"Hibernate ile eklendi");
		
	}

}
