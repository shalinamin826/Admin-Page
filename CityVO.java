package vo;

import java.io.Serializable;

public class CityVO implements Serializable {

	private int cityId;
	private String cityName;
	private StateVO stateVo;
	private CountryVO countryVo;

	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public StateVO getStateVo() {
		return stateVo;
	}
	public void setStateVo(StateVO stateVo) {
		this.stateVo = stateVo;
	}
	public CountryVO getCountryVo() {
		return countryVo;
	}
	public void setCountryVo(CountryVO countryVo) {
		this.countryVo = countryVo;
	}


}
