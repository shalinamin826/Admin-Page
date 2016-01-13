package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.CountryVO;
import dao.CountryDAO;

/**
 * Servlet implementation class Insert_cont
 */
@WebServlet("/CountryController")
public class CountryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CountryController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String flag = request.getParameter("flag");
		if (flag.equals("searchCountry")) {
			searchCountry(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String flag = request.getParameter("flag");
		if (flag.equals("insert")) {
			insertCountry(request, response);
		} else if (flag.equals("edit")) {
			edit(request, response);
		}
		else if (flag.equals("deleteCountry")) {
			deleteCountry(request, response);
		}
	}

	protected void deleteCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CountryVO cvo = new CountryVO();
		CountryDAO cdao = new CountryDAO();
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("countryName");
		cvo.setCountryId(id);
		cvo.setCountryName(name);
		cdao.deleteCountry(cvo);
		// response.sendRedirect("countryController?flag=searchCountry");
		searchCountry(request, response);
	}

	protected void searchCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		CountryVO cvo = new CountryVO();
		CountryDAO cdao = new CountryDAO();
		List li = cdao.searchCountry(cvo);
		HttpSession session = request.getSession();
		session.setAttribute("li1", li);
		response.sendRedirect("searchCountry.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void edit(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		CountryVO cvo = new CountryVO();
		CountryDAO cdao = new CountryDAO();

		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("countryName");
		cvo.setCountryId(id);
		cvo.setCountryName(name);
		cdao.editCountry(cvo);
		// response.sendRedirect("countryController?flag=searchCountry");
		searchCountry(request, response);

	}

	protected void insertCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CountryVO cvo = new CountryVO();
		CountryDAO cdao = new CountryDAO();
		String countryName = request.getParameter("countryName");
		System.out.println(countryName);

		cvo.setCountryName(countryName);

		cdao.insertCountry(cvo);
		response.sendRedirect("Add_Country.jsp");

	}

}
