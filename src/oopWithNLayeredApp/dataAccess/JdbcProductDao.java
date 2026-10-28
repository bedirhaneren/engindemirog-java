package oopWithNLayeredApp.dataAccess;
import oopWithNLayeredApp.entities.Product;
 //data acces object dao

public class JdbcProductDao implements ProductDao{
    @Override
    public void add(Product product) {
        System.out.println("Jbdc ile veri tabanına eklendi");

    }
}
