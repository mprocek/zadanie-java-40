public class WeatherInfo {
    private String city;
    private int temp;
    private String description;

    public WeatherInfo(String city, int temp, String description) {
        this.city = city;
        this.temp = temp;
        this.description = description;
    }

    public String getCity() {
        return city;
    }

    public int getTemp() {
        return temp;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return city + ";" + temp + ";" + description;
    }
}
