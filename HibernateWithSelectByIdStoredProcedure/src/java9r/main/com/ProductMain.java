package java9r.main.com;
import java9r.dao.com.ProductDAO;
import java9r.entites.com.Product;
public class ProductMain {
 public static void main(String[] args) {
  ProductDAO product=new ProductDAO();
  Product p =product.FindAllByIdProducts(2);
  
   System.out.println("Id " + p.getId());
   System.out.println("Name " + p.getName());
   System.out.println("Price  " + p.getPrice());
   System.out.println("Description  " + p.getDescription());
   System.out.println("Status  " + p.getActive());
   System.out.println("---------------");
  
 }

}
