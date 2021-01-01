package Controller;

import Model.Pattern;
import Service.PatternDAO;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "StudentServlet", urlPatterns = "/patterns")
public class PatternServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private PatternDAO patternDAO;

    public void init() {
        try {
            patternDAO = new PatternDAO();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    insertPattern(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                try {
                    updatePattern(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    private void updatePattern(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        String id = request.getParameter("id");
        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String tenBenhNhan = request.getParameter("tenBenhNhan");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");
        Pattern newPattern = new Pattern( id, maBenhAn, maBenhNhan,
                tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        patternDAO.updatePattern(newPattern);
        response.sendRedirect("/patterns");
    }

    private void insertPattern(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String id = request.getParameter("id");
        String maBenhAn = request.getParameter("maBenhAn");
        String maBenhNhan = request.getParameter("maBenhNhan");
        String tenBenhNhan = request.getParameter("tenBenhNhan");
        String ngayNhapVien = request.getParameter("ngayNhapVien");
        String ngayRaVien = request.getParameter("ngayRaVien");
        String lyDoNhapVien = request.getParameter("lyDoNhapVien");
        Pattern newPattern = new Pattern( id, maBenhAn, maBenhNhan,
                tenBenhNhan, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        patternDAO.insertPattern(newPattern);
        List<Pattern> listPattern = patternDAO.selectAllPatterns();
        request.setAttribute("listPattern", listPattern);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pattern/create.jsp");
        dispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "edit":
                showEditForm(request, response);
                break;
            case "delete":
                try {
                    deletePattern(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "search":

                    searchForm(request, response);

                break;
            default:
                listPattern(request, response);
                break;
        }
    }

    private void listPattern(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Pattern> listPattern = patternDAO.selectAllPatterns();
        request.setAttribute("listPattern", listPattern);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pattern/view.jsp");
        dispatcher.forward(request, response);
    }

    private void searchForm(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deletePattern(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        patternDAO.deletePattern(id);
        List<Pattern> listPattern = patternDAO.selectAllPatterns();
        request.setAttribute("listPattern", listPattern );
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("pattern/view.jsp");
        requestDispatcher.forward(request, response);
    }

    private void showEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Pattern pattern = patternDAO.selectPattern(id);
        RequestDispatcher dispatcher = request.getRequestDispatcher("pattern/edit.jsp");
        request.setAttribute("pattern", pattern);
        dispatcher.forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("pattern/create.jsp");
        dispatcher.forward(request, response);
    }
}
