package day04;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderByIstvan {

    public static void main(String[] args) {
        FileReaderByIstvan fileReaderByIstvan = new FileReaderByIstvan();

        System.out.println(fileReaderByIstvan.findSmallestTemperatureSpread("weather.dat"));
        System.out.println(fileReaderByIstvan.findSmallestTeamDifference("football.dat"));
    }

    private int findSmallestTemperatureSpread(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/" + filename));

            int minSpreed = 1000;
            int minDay = 0;

            for (int i = 2; i < lines.size() - 1; i++) {
                int day = Integer.parseInt(lines.get(i).substring(2, 4).trim());
                int max = Integer.parseInt(lines.get(i).substring(6, 8).trim());
                int min = Integer.parseInt(lines.get(i).substring(12, 14).trim());

                int spreed = max - min;
                if (minSpreed > spreed) {
                    minSpreed = spreed;
                    minDay = day;
                }
            }
            return minDay;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String findSmallestTeamDifference(String filename) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/" + filename));

            int minDifference = 1000;
            String minName = null;

            for (int i = 1; i < lines.size(); i++) {
                if (i != 18) {
                    String name = lines.get(i).substring(7, 22).trim();
                    int max = Integer.parseInt(lines.get(i).substring(43, 45).trim());
                    int min = Integer.parseInt(lines.get(i).substring(50, 52).trim());

                    int spreed = Math.abs(max - min);
                    if (minDifference > spreed) {
                        minDifference = spreed;
                        minName = name;
                    }
                }
            }
            return minName;
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }
}
