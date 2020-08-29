package lessons.group11;

public class Address {
	
	private String country;
	private String city;
	private String street;
	private String building;
	
	public Address() {
	}
	public Address(String country) {
		this.country = country;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getBuilding() {
		return building;
	}
	public void setBuilding(String building) {
		this.building = building;
	}
	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", street=" + street + ", building=" + building + "]";
	}
}
