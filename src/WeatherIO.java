import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WeatherIO {

    public static WeatherInfo readWeather(WeatherApi weatherApi, String city) throws IOException {
        return new WeatherInfo(city,weatherApi.getTemperature(city),weatherApi.getDescription(city));
    }

    public static void writeWeather(ArrayList<WeatherInfo> weatherInfos) throws IOException {
        FileWriter fileWriter = new FileWriter("citiesWeather.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for(int i=0;i<weatherInfos.size();i++){
            bufferedWriter.write(weatherInfos.get(i).toString());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
