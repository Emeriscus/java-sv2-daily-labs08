package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public int findSmallestTemperatureSpread(String filename) {

        List<Weather> weathers = getUsefulData(readFile(filename));

        int minSpread = Integer.MAX_VALUE;
        int minDay = 0;
        for (Weather actual : weathers) {
            if (actual.getMaxTemp() - actual.getMinTemp() < minSpread) {
                minSpread = actual.getMaxTemp() - actual.getMinTemp();
                minDay = actual.getDay();
            }
        }
        return minDay;
    }

    private List<String> readFile(String filename) {
        Path path = Paths.get("src/main/resources/" + filename);
        try {
            return Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalArgumentException("Cannot read file!", ioe);
        }
    }

    private List<Weather> getUsefulData(List<String> weathers) {

        List<Weather> weathersData = new ArrayList<>();
        int day;
        int maxTemp;
        int minTemp;

        for (int i = 2; i < weathers.size() - 1; i++) {
            day = Integer.parseInt(weathers.get(i).substring(2, 4).trim());
            maxTemp = Integer.parseInt(weathers.get(i).substring(6, 8).trim());
            minTemp = Integer.parseInt(weathers.get(i).substring(12, 14).trim());
            weathersData.add(new Weather(day, maxTemp, minTemp));
        }
        return weathersData;
    }

    public String findSmallestTeamDifference(String filename) {

        List<String> lines = readFile(filename);

        int minDifference = Integer.MAX_VALUE;
        String teamWithMinDifference = null;

        for (int i = 1; i < lines.size(); i++) {
            String team = (lines.get(i).substring(7, 23).trim());
            if (!team.contains("-")) {

                int scoredGoals = Integer.parseInt(lines.get(i).substring(43, 45).trim());
                int concededGoals = Integer.parseInt(lines.get(i).substring(50, 52).trim());

                int difference = Math.abs(concededGoals - scoredGoals);
                if (minDifference > difference) {
                    minDifference = difference;
                    teamWithMinDifference = team;
                }
            }
        }
        return teamWithMinDifference;
    }

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();

        System.out.println(fileReader.findSmallestTemperatureSpread("weather.dat"));
        System.out.println(fileReader.findSmallestTeamDifference("football.dat"));
    }
}
