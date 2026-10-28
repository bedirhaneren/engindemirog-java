package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.loging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager {

    private ProductDao productDao;
    private Logger[] loggers;
    public ProductManager(ProductDao productDao, Logger[] loggers) {
        this.productDao =  productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice() <10) {
            throw new Exception("Urun fiyati 10dan kucuk olamaz");
        }
        productDao.add(product);

        for(Logger logger : loggers){ //db mail logger sıraya calısır
            logger.log(product.getName());
        }

    }
}
