package oopWithNLayeredAppForrKodlama;

import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import oopWithNLayeredAppForrKodlama.business.productManager;

import oopWithNLayeredAppForrKodlama.dataAccess.jdbcProductDao;
import oopWithNLayeredAppForrKodlama.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Logger[] loggers = new Logger[] { new DataBaseLogger(), new MailLogger(), new FileLogger() };

		Product product = new Product("Java", "Bölüm-1", "Engin demiroğ", 5, "Java kursu");

		productManager manager = new productManager(new jdbcProductDao(), loggers);
		manager.add(product);

	}

}
