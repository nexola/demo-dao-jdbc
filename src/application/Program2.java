package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Department department = new Department();

        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

        System.out.println("=== TEST 1: department findById ===");

        System.out.println();

        System.out.println("=== TEST 2: department findByDepartment ===");

        System.out.println();

        System.out.println("=== TEST 3: department findAll ===");

        System.out.println();

        System.out.println("=== TEST 4: department insert ===");
        department = new Department(null, "Jóias");
//        departmentDAO.insert(department);
        System.out.println("Inserção concluída, novo ID = " + department.getId());

        System.out.println();

        System.out.println("=== TEST 5: department update ===");
        department = new Department(6, null);
        department.setName("Cars");
//        departmentDAO.update(department);
        System.out.println("Update concluído!");

        System.out.println();

        System.out.println("=== TEST 6: department delete ===");
        System.out.print("Insira o ID para exclusão: ");
//        int id = sc.nextInt();
//        departmentDAO.deleteById(id);
        System.out.println("Exclusão concluída!");

        sc.close();
    }
}
