package application;

import model.dao.DaoFactory;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SellerDAO sellerDAO = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDAO.findById(5);
        System.out.println(seller);

        System.out.println();

        System.out.println("=== TEST 2: seller findByDepartment ===");
        Department department = new Department(2, null);
        List<Seller> sellers = sellerDAO.findByDepartment(department);
        for (Seller vendedor : sellers) {
            System.out.println(vendedor);
        }

        System.out.println("=== TEST 3: seller findAll ===");
        List<Seller> sellersAll = sellerDAO.findAll();
        for (Seller vendedor : sellersAll) {
            System.out.println(vendedor);
        }

        System.out.println("=== TEST 4: seller insert ===");
        Seller vendedor = new Seller(null, "Greg", "greg@gmail.com", 4000.0, new Date(), department);
//        sellerDAO.insert(vendedor);
        System.out.println("Inserido! Novo ID = " + vendedor.getId());

        System.out.println("=== TEST 5: seller update ===");
        vendedor = sellerDAO.findById(1);
        vendedor.setName("Julio Donofreo");
//        sellerDAO.update(vendedor);
        System.out.println("Update concluído!");

        System.out.println("=== TEST 6: seller delete ===");
        System.out.print("Entre com o ID para exclusão: ");
//        int id = sc.nextInt();
//        sellerDAO.deleteById(id);
        System.out.println("Exclusão concluída!");
        sc.close();
    }
}
