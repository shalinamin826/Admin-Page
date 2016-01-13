package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vo.CityVO;
import vo.CountryVO;
import vo.StateVO;
import dao.CityDAO;

/**
 * Servlet implementation class CityController
 */
@WebServlet("/CityController")
public class CityController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CityController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String flag = request.getParameter("flag");

		if (flag != null && flag.equals("loadCountryState")) {
			loadCountryState(request, response);
		}

 else if (flag.equals("searchCity")) {
			searchCity(request, response);
		}

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		String flag = request.getParameter("flag");

		if (flag.equals("insertCity")) {
			insertCity(request, response);
		}
		if (flag.equals("deleteCity")) {
			deleteCity(request, response);
		}
		if (flag.equals("editCity")) {
			editCity(request, response);
		}
		if (flag.equals("updateCity")) {
			updateCity(request, response);
		}

	}

	private void updateCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
			
		int cityId = Integer.parseInt(request.getParameter("cityId"));
		int stateId = Integer.parseInt(request.getParameter("stateId"));
		int countryId = Integer.parseInt(request.getParameter("countryId"));
		String cityName = request.getParameter("cityName");
			
		CityVO cityVO = new CityVO();
		StateVO stateVO = new StateVO();
		CountryVO countryVO = new CountryVO();

		countryVO.setCountryId(countryId);
		stateVO.setStateId(stateId);
		cityVO.setCityId(cityId);
		cityVO.setCityName(cityName);
		cityVO.setCountryVo(countryVO);
		cityVO.setStateVo(stateVO);
		CityDAO cityDAO = new CityDAO();
		cityDAO.updateCity(cityVO);
			
		searchCity(request, response);

			}
	protected void loadCountryState(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		CountryVO countryVO = new CountryVO();
		StateVO stateVO = new StateVO();
		CityDAO cityDAO = new CityDAO();
		List ls = cityDAO.loadCountry(countryVO);
		List ls1 = cityDAO.loadState(stateVO);
		HttpSession session = request.getSession();
		session.setAttribute("countryList", ls);
		session.setAttribute("stateList", ls1);
		response.sendRedirect("addCity.jsp");

	}

	protected void searchCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		CityVO cityVO = new CityVO();
		CityDAO cityDAO = new CityDAO();


		List li = cityDAO.searchCity(cityVO);
		HttpSession session = request.getSession();
		session.setAttribute("li", li);
		response.sendRedirect("searchCity.jsp");

	}

	protected void editCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();

		int cityId = Integer.parseInt(request.getParameter("id"));

		CityVO cityVO = new CityVO();
		StateVO stateVO = new StateVO();
		CountryVO countryVO = new CountryVO();
		CityDAO cityDAO = new CityDAO();

		cityVO.setCityId(cityId);


		List cityList = cityDAO.loadCity(cityVO);
		List stateList = cityDAO.loadState(stateVO);
		List countryList = cityDAO.loadCountry(countryVO);
		session.setAttribute("cityList", cityList);
		session.setAttribute("stateList", stateList);
		session.setAttribute("countryList", countryList);
		// List li = cityDAO.searchCity(cityVO);
		// session.setAttribute("li", li);
		response.sendRedirect("editCity.jsp");

	}

	protected void deleteCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("id"));
		String cityName = request.getParameter("cityName");

		CityVO cityVO = new CityVO();
		CountryVO countryVO = new CountryVO();
		StateVO stateVO = new StateVO();
		CityDAO cityDAO = new CityDAO();

		cityVO.setCityId(id);
		// cityVO.setCityName(cityName);
		// cityVO.setCountryVo(countryVO);
		// cityVO.setStateVo(stateVO);


		cityDAO.deleteCity(cityVO);


		searchCity(request, response);

	}

	
	protected void insertCity(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int countryId = Integer.parseInt(request.getParameter("countryId"));
		int stateId = Integer.parseInt(request.getParameter("stateId"));
		String cityName = request.getParameter("cityName");

		CityVO cityVO = new CityVO();

		StateVO stateVO = new StateVO();
		CountryVO countryVO = new CountryVO();

		countryVO.setCountryId(countryId);

		stateVO.setStateId(stateId);

		cityVO.setCityName(cityName);

		cityVO.setCountryVo(countryVO);
		cityVO.setStateVo(stateVO);

		CityDAO cityDAO = new CityDAO();
		cityDAO.insertCity(cityVO);

		response.sendRedirect("addCity.jsp");

	}

}
