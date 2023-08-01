import java.util.Arrays;
import java.util.Objects;

public class City {
	
	/**
	 * {
“City”             : “ ”
“Coordinates”:
[
                    “Lattidute”: “ ”
                    “Longitude”: “ ”
]
“Temperature”: “ ”
}
	 */
	
	private String city;
	private String [] Coordinates;
	private String Temperature;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String[] getCoordinates() {
		return Coordinates;
	}
	public void setCoordinates(String[] coordinates) {
		Coordinates = coordinates;
	}
	public String getTemperature() {
		return Temperature;
	}
	public void setTemperature(String temperature) {
		Temperature = temperature;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(Coordinates);
		result = prime * result + Objects.hash(Temperature, city);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Arrays.equals(Coordinates, other.Coordinates) && Objects.equals(Temperature, other.Temperature)
				&& Objects.equals(city, other.city);
	}
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "City [city=" + city + ", Coordinates=" + Arrays.toString(Coordinates) + ", Temperature=" + Temperature
				+ "]";
	}
	
	
	
	
	

}
