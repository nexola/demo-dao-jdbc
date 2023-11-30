package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Seller;


public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(5);

        System.out.println(seller);

    }
}
