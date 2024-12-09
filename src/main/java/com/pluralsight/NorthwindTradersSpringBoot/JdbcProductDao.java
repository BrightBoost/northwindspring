package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class JdbcProductDao implements ProductDao {

    private DataSource dataSource;

    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public boolean add(Product product) {
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Products (ProductID, ProductName, CategoryId, UnitPrice) values(?, ?, ?, ?)");
            preparedStatement.setInt(1, product.getProductId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, Integer.parseInt(product.getCategory()));
            preparedStatement.setDouble(4, product.getPrice());
            int rowsAffected = preparedStatement.executeUpdate();
            System.out.println(rowsAffected + " were added.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        try(Connection connection = dataSource.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM Products");
            ResultSet rs = preparedStatement.executeQuery();
            while(rs.next()) {
                // int productId, String name, String category, double price
                Product product = new Product(rs.getInt(1), rs.getString(2), rs.getString(4), rs.getDouble(6));
                products.add(product);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
