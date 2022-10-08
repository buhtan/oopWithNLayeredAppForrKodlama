package oopWithNLayeredAppForrKodlama.dataAccess;

import oopWithNLayeredAppForrKodlama.entities.Product;

public class jdbcProductDao implements ProductDao{

	@Override
	public void add(Product product) {
		System.out.println(product.getEgitmen()+" Jdbc ile eklendi");
		
	}

}
