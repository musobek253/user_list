import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CabinetSrevlet extends HttpServlet {

    UserService userService = new UserService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("login1.html");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        PrintWriter printWriter = resp.getWriter();
        resp.setContentType("text/html");
        List<User>users  = UserService.getUser();
        if (users.size() != 0){
        users.forEach(user -> {
                if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                    printWriter.write("<h1>Tizimga xush kelibsiz</h1>");
                } else printWriter.write("<h1>bunday user yoq</h1>");
            }

        );

    }else printWriter.write("Listda userlar mavjud emas");
    }
}
