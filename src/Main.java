//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         System.out.printf("Hello and welcome!");

         Product product1 = new Product();
         product1.name= "Kahve makinesi" ;
         product1.unitPrice= 7500;
         product1.discount= 0.7;
         product1.unitsInStock= 10;
         product1.imageUrl= "asdasd.jpeg";


        Product product2 = new Product();
        product2.name= "kahve" ;
        product2.unitPrice= 7500;
        product2.discount= 0.7;
        product2.unitsInStock= 10;
        product2.imageUrl= "asdasd.jpeg";


        Product product3= new Product();
        product3.name= "aifry" ;
        product3.unitPrice= 7500;
        product3.discount= 0.7;
        product3.unitsInStock= 10;
        product3.imageUrl= "asdasd.jpeg";


        Product[] products = {product1,product2,product3};

        for (Product product : products) {
            System.out.println(product.name);
        }

        IndividualCustomer individualCustomer = new IndividualCustomer() ;
        individualCustomer.setCustomerNumber("1234567890");
        individualCustomer.setFirstName("Ali");
        individualCustomer.setLastName("Kahve");

        CorporateCustomer corporateCustomer = new CorporateCustomer() ;
        corporateCustomer.setCompanyName("Tusas");
        corporateCustomer.setId(4);
        individualCustomer.setCustomerNumber("123456782390");

        Customer[] customers= {individualCustomer,corporateCustomer};


    }
}