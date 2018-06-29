import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Weather {
    public static void main(String[] args) throws IOException {
        File file = new File("cities.txt");
        Scanner scan = new Scanner(file);
        WeatherApi weatherApi = new WeatherApi();
        ArrayList<WeatherInfo> weatherInfos = new ArrayList<>();


        while (scan.hasNextLine()){
            String city = scan.nextLine();
            weatherInfos.add(WeatherIO.readWeather(weatherApi,city));
        }

        for(int i=0;i<weatherInfos.size();i++){
            System.out.println(weatherInfos.get(i));
        }

        WeatherIO.writeWeather(weatherInfos);
    }
}
