import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/skillbox";
        String user = "root";
        String password = "testtest";


        try {

            Connection connection = DriverManager.getConnection(url, user, password);

            Statement statement = connection.createStatement();

            String averageSQL = "SELECT pl.course_name, ROUND(COUNT(course_name)/ ( 1 + (MAX(MONTH(pl.subscription_date)) - MIN(MONTH(pl.subscription_date)))),2) AS \"average\"\n" +
                    "FROM PurchaseList pl\n" +
                    "WHERE pl.subscription_date BETWEEN '2018-01-01 00:00:00' AND '2018-12-31 00:00:00'\n" +
                    "GROUP BY pl.course_name";

            ResultSet resultSet = statement.executeQuery(averageSQL);

            while (resultSet.next()) {

                String course_name = resultSet.getString("course_name");
                String average = resultSet.getString("average");
                System.out.println(course_name + "  " + average);


            }
            connection.close();
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
