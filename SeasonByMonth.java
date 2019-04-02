import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonByMonth {

    public static void main(String arg[]) throws IOException {
        Season season;
        season = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, enter the month");
        String input = br.readLine();
        String month = input.toLowerCase();
        switch (month) {
        case "december":
        case "january":
        case "february":
            season = Season.WINTER;
            break;
        case "march":
        case "april":
        case "may":
            season = Season.SPRING;
            break;
        case "june":
        case "july":
        case "august":
            season = Season.SUMMER;
            break;
        case "september":
        case "october":
        case "november":
            season = Season.AUTUMN;
            break;
        default:
            System.out.println("No such month");
        }
        if (season != null)
            System.out.println("The month " + input.toUpperCase() + " relates to the following season " + season);
    }

    public enum Season { WINTER, SPRING, SUMMER, AUTUMN }
}

