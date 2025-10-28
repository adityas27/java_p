import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/login_db";
    private static final String DB_USER = "loginuser";
    private static final String DB_PASSWORD = "mypassword";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String uname = request.getParameter("username");
        String pwd = request.getParameter("password");

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use try-with-resources to avoid leaks
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement ps = conn.prepareStatement(
                         "SELECT * FROM users WHERE username = ? AND password = ?")) {

                ps.setString(1, uname);
                ps.setString(2, pwd);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        request.setAttribute("username", uname);
                        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
                        rd.forward(request, response);
                    } else {
                        RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
                        rd.forward(request, response);
                    }
                }
            }
        } catch (Exception e) {
            throw new ServletException("Login Failed", e);
        }
    }
}
