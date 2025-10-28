import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UserListServlet")
public class UserListServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/login_db";
    private static final String DB_USER = "loginuser";
    private static final String DB_PASSWORD = "mypassword";

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><head><title>User List</title></head><body>");
        out.println("<h1>User List (Name & Phone)</h1>");
        out.println("<table border='1'>");
        out.println("<tr><th>Name</th><th>Phone Number</th></tr>");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement ps = conn.prepareStatement("SELECT username, phone FROM users");
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String name = rs.getString("username");
                    String phone = rs.getString("phone");
                    out.println("<tr><td>" + name + "</td><td>" + phone + "</td></tr>");
                }
            }
        } catch (Exception e) {
            out.println("<tr><td colspan='2'>Error: " + e.getMessage() + "</td></tr>");
        }

        out.println("</table>");
        out.println("</body></html>");
    }
}