import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static String readFileAsString(String filepath) {
        StringBuilder output = new StringBuilder();

        try (Scanner scanner = new Scanner(new File(filepath))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                output.append(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return output.toString();
    }

    public static ArrayList<ElectionResults> parse2016PresidentialResults(String data) {
        ArrayList<ElectionResults> output = new ArrayList<>();

        data = data.substring(data.indexOf("\n") + 1);
        String[] dataSet = data.split("\n");

        for (int i = 0; i < dataSet.length; i++) {
            String str = removeJunkFromElectionData(dataSet[i]);
            String[] values = str.split(",");
            ElectionResults electionResults = createElectionResults(values);
            output.add(electionResults);
        }

        return output;
    }

    private static String removeJunkFromElectionData(String str) {

        String str1, str2, str3;
        int firstQuote = 0, secondQuote = 0, quotedComma = 0;
        firstQuote = str.indexOf("\"");
        secondQuote = str.indexOf("\"", firstQuote + 1);
        quotedComma = str.indexOf(",", firstQuote);
        str = str.substring(str.indexOf(",") + 1);
        while (quotedComma < secondQuote) {
            firstQuote = str.indexOf("\"");
            secondQuote = str.indexOf("\"", firstQuote + 1);
            quotedComma = str.indexOf(",", firstQuote);
            if (quotedComma < secondQuote) {
                str1 = str.substring(0, quotedComma);
                str2 = str.substring(quotedComma + 1);
                str = str1 + str2;
            }
        }
        if (firstQuote != -1) {
            firstQuote = str.indexOf("\"");
            secondQuote = str.indexOf("\"", firstQuote + 1);
            str1 = str.substring(0, firstQuote);
            str2 = str.substring(firstQuote + 1, secondQuote);
            str3 = str.substring(secondQuote + 1);
            str = str1 + str2 + str3;
        }
        int percent = str.indexOf("%");
        if (percent != -1) {
            str1 = str.substring(0, percent);
            str2 = str.substring(percent + 1);
            str = str1 + str2;
        }

        return str;

    }

    private static ElectionResults createElectionResults(String[] values) {
        double votesDem = Double.parseDouble(values[0]);
        double votesGOP = Double.parseDouble(values[1]);
        double totalVotes = Double.parseDouble(values[2]);
        double perDem = Double.parseDouble(values[3]);
        double perGOP = Double.parseDouble(values[4]);
        int diff = Integer.parseInt(values[5]);
        double perPointDiff = Double.parseDouble(values[6]);
        String stateAbbr = values[7];
        String countyName = values[8];
        int combinedFips = Integer.parseInt(values[9]);
        ElectionResults output = new ElectionResults(votesDem, votesGOP, totalVotes, perDem, perGOP, diff, perPointDiff, stateAbbr, countyName, combinedFips);
        return output;
    }

}
