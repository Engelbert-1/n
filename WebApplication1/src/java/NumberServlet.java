import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/exe") 
public class NumberServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Lấy giá trị từ form
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");

        // Kiểm tra nếu trống
        if (num1Str.isEmpty() || num2Str.isEmpty()) {
            out.println("<h3>Please do not leave any field empty.</h3>");
            return;
        }

        try {
            int num1 = Integer.parseInt(num1Str);
            int num2 = Integer.parseInt(num2Str);

            // Kiểm tra nếu là số âm
            if (num1 < 0 || num2 < 0) {
                out.println("<h3>Please enter positive numbers only.</h3>");
                return;
            }

            // Tính ước chung của hai số
            out.println("<h3>Common divisors of " + num1 + " and " + num2 + ":</h3>");
            for (int i = 1; i <= Math.min(num1, num2); i++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    out.println(i + " ");
                }
            }
        } catch (NumberFormatException e) {
            out.println("<h3>Please enter valid numbers.</h3>");
        }
    }
}