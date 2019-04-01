import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonByMonth {

    public enum Season{
        WINTER, SPRING, SUMMER, AUTUMN
    }

    public static void main(String arg[]) throws IOException {
        Season season;
        season = Season.WINTER;
        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Please, enter the month");
        String input = br.readLine();

        String month=input.toLowerCase();
        switch (month){
            case "december":
            case "january":
            case "february":
                System.out.println("The month " + input.toUpperCase() + " relates to the following season " + season);
                break;
            case "march":
            case "april":
            case "may":
                season=season.SPRING;
                System.out.println("The month " + input.toUpperCase() + " relates to the following season " + season);
                break;
            case "june":
            case "july":
            case "august":
                season=season.SUMMER;
                System.out.println("The month " + input.toUpperCase() + " relates to the following season " + season);
                break;
            case "september":
            case "october":
            case "november":
                season=season.AUTUMN;
                System.out.println("The month " + input.toUpperCase() + " relates to the following season " + season);
                break;
            default:
                System.out.println("No such month");
        }

    }
}

