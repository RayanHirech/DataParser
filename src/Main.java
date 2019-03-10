import java.util.ArrayList;

/***
 * Main class for data parsers
 * @author: Rayan Hirech
 */

public class Main {

    public static void main(String[] args) {

        String electionData = Utils.readFileAsString("data/2016_Presidential_Results.csv");
        ArrayList<ElectionResults> electionResults = Utils.parse2016PresidentialResults(electionData);

//        for (int i = 0; i < electionResults.size(); i++) {
//            System.out.println(electionResults.get(i).toString());
//        }

    }

}
