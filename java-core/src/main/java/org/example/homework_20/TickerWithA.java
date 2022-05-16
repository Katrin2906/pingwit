package org.example.homework_20;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TickerWithA {

    private static final String URL = "jdbc:postgresql://localhost:5432/stocks";
    private static final String USERNAME = "postgres";
    private static final String PASSWORD = "docker";

    private static final String SELECT_BY_TICKER = "SELECT * FROM stocks s WHERE s.ticker LIKE '%A%;";

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD)) {
            PreparedStatement prs = connection.prepareStatement(SELECT_BY_TICKER);
            prs.setString(1, "ticker");

            ResultSet rs = prs.executeQuery();

            List<Stock> stocks = new ArrayList<>();

            while (rs.next()) {
                Stock stock = new Stock(
                        rs.getLong(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getLong(4),
                        rs.getString(5),
                        rs.getLong(6)
                );
                stocks.add(stock);
            }
            stocks.forEach(System.out::println);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
