package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.CategoryVO;
import dao.CategoryDAO;

/**
 * Servlet implementation class CategoryController
 */
@WebServlet("/CategoryController")
public class CategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CategoryController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag = request.getParameter("flag");
		if (flag.equals("searchCategory")) {
			searchCategory(request, response);
		}
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag = request.getParameter("flag");
		if (flag.equals("insert")) {
			insertCategory(request, response);
		} else if (flag.equals("edit")) {
			edit(request, response);

		} else if (flag.equals("deleteCategory")) {
			deleteCategory(request, response);
		}
	}

	protected void deleteCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CategoryVO cvo = new CategoryVO();
		CategoryDAO cdao = new CategoryDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("categoryName");
		cvo.setCategoryId(id);
		cvo.setCategoryName(name);
		cdao.deleteCategory(cvo);
		// response.sendRedirect("categoryController?flag=searchCategory");
		searchCategory(request, response);
	}

	protected void searchCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		CategoryVO cvo = new CategoryVO();
		CategoryDAO cdao = new CategoryDAO();
		List li = cdao.searchCategory(cvo);
		HttpSession session = request.getSession();
		session.setAttribute("li1", li);
		response.sendRedirect("searchCategory.jsp");

	}

	protected void edit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CategoryVO cvo = new CategoryVO();
		CategoryDAO cdao = new CategoryDAO();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("categoryName");
		cvo.setCategoryId(id);
		cvo.setCategoryName(name);
		cdao.editCategory(cvo);
		// response.sendRedirect("categoryController?flag=searchCategory");
		searchCategory(request, response);

	}

	protected void insertCategory(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CategoryVO cvo = new CategoryVO();
		CategoryDAO cdao = new CategoryDAO();
		String categoryName = request.getParameter("categoryName");
		System.out.println(categoryName);

		cvo.setCategoryName(categoryName);

		cdao.insertCategory(cvo);
		response.sendRedirect("addCategory.jsp");

	}


}
