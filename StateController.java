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
import vo.StateVO;
import dao.StateDAO;

/**
 * Servlet implementation class StateController
 */
@WebServlet("/StateController")
public class StateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StateController() {
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
		if (flag != null && flag.equals("loadCountry")) {
			loadCountry(request, response);
		} else if (flag.equals("searchState")) {
			searchState(request, response);
		}

	}

	private void searchState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		StateVO stateVO = new StateVO();
		StateDAO stateDAO = new StateDAO();
		List li = stateDAO.searchState(stateVO);
		HttpSession session = request.getSession();
		session.setAttribute("searchstate", li);
		response.sendRedirect("searchState.jsp");

	}

	private void loadCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		CountryVO countryVO = new CountryVO();
		StateDAO stateDAO = new StateDAO();
		List ls = stateDAO.loadCountry(countryVO);
		HttpSession session = request.getSession();
		session.setAttribute("countryList", ls);
		response.sendRedirect("addState.jsp");

	}

	private void editloadCountry(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int stateId = Integer.parseInt(request.getParameter("stateId"));
		StateVO stateVO = new StateVO();
		stateVO.setStateId(stateId);
		StateDAO stateDAO = new StateDAO();
		List ls = stateDAO.loadState(stateVO);
		System.out.println("state size on controller : : >>>  " + ls.size());
		HttpSession session = request.getSession();
		session.setAttribute("stateList", ls);

		CountryVO countryVO = new CountryVO();
		List lsCountry = stateDAO.loadCountry(countryVO);
		System.out.println("country size on controller : : >>>  " + lsCountry.size());
		session.setAttribute("countryList", lsCountry);
		response.sendRedirect("editState.jsp");


	}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String flag = request.getParameter("flag");
		if (flag != null && flag.equals("insertState")) {
			insertState(request, response);
		}
 else if (flag != null && flag.equals("deletestate")) {
			deleteState(request, response);
		}
 else if (flag != null && flag.equals("editloadCountry")) {
			editloadCountry(request, response);
		}
 else if (flag != null && flag.equals("updateState")) {
			updateState(request, response);
		}

	}

	private void updateState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stateName = request.getParameter("stateName");
		int stateId = Integer.parseInt(request.getParameter("stateId"));
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		StateVO stateVO = new StateVO();
		stateVO.setStateId(stateId);
		stateVO.setStateName(stateName);
		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(countryId);
		stateVO.setCountryVO(countryVO);
		StateDAO stateDAO = new StateDAO();
		stateDAO.updateState(stateVO);
		searchState(request, response);

	}

	private void deleteState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int stateId = Integer.parseInt(request.getParameter("stateId"));


		StateVO stateVO = new StateVO();
		stateVO.setStateId(stateId);

		StateDAO stateDAO = new StateDAO();
		stateDAO.deleteState(stateVO);
		// response.sendRedirect("searchState.jsp");

		searchState(request, response);

	}

	private void insertState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int countryId = Integer.parseInt(request.getParameter("countryId"));
		String stateName = request.getParameter("stateName");

		CountryVO countryVO = new CountryVO();
		countryVO.setCountryId(countryId);

		StateVO stateVO = new StateVO();
		stateVO.setStateName(stateName);
		stateVO.setCountryVO(countryVO);

		StateDAO stateDAO = new StateDAO();
		stateDAO.insertState(stateVO);
		response.sendRedirect("addState.jsp");

	}

}
