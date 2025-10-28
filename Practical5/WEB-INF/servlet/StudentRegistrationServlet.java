import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentRegistrationServlet")
public class StudentRegistrationServlet extends HttpServlet {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/login_db";
    private static final String DB_USER = "loginuser";
    private static final String DB_PASSWORD = "mypassword";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("studentName");
        String course = request.getParameter("course");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
                 PreparedStatement ps = conn.prepareStatement("INSERT INTO students (name, course) VALUES (?, ?)")) {

                ps.setString(1, name);
                ps.setString(2, course);

                int result = ps.executeUpdate();

                response.setContentType("text/html");
                response.getWriter().println("<html><head><title>Registration Result</title></head><body>");
                if (result > 0) {
                    response.getWriter().println("<h3>Student Registered Successfully!</h3>");
                } else {
                    response.getWriter().println("<h3>Registration Failed!</h3>");
                }
                response.getWriter().println("</body></html>");
            }
        } catch (Exception e) {
            throw new ServletException("Registration Failed", e);
        }
    }
}