public class ElectionResults {

    private double votesDem;
    private double votesGOP;
    private double totalVotes;
    private double perDem;
    private double perGOP;
    private int diff;
    private double perPointDiff;
    private String stateAbbr;
    private String countyName;
    private int combinedFips;

    public ElectionResults(double votesDem, double votesGOP, double totalVotes, double perDem, double perGOP, int diff, double perPointDiff, String stateAbbr, String countyName, int combinedFips) {

        this.votesDem = votesDem;
        this.votesGOP = votesGOP;
        this.totalVotes = totalVotes;
        this.perDem = perDem;
        this.perGOP = perGOP;
        this.diff = diff;
        this.perPointDiff = perPointDiff;
        this.stateAbbr = stateAbbr;
        this.countyName = countyName;
        this.combinedFips = combinedFips;

    }

    public double getVotesDem() {
        return votesDem;
    }

    public void setVotesDem(double val) {
        this.votesDem = val;
    }

    public double getVotesGOP() {
        return votesGOP;
    }

    public void setVotesGOP(double val) {
        this.votesGOP = val;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes(double val) {
        this.totalVotes = val;
    }

    public double getPerDem() {
        return perDem;
    }

    public void setPerDem(double val) {
        this.perDem = val;
    }

    public double getPerGOP() {
        return perGOP;
    }

    public void setPerGOP(double val) {
        this.perGOP = val;
    }

    public int getDiff() {
        return diff;
    }

    public void setDiff(int val) {
        this.diff = val;
    }

    public double getPerPointDiff() {
        return perPointDiff;
    }

    public void setPerPointDiff(double val) {
        this.perPointDiff = val;
    }

    public String getStateAbbr() {
        return stateAbbr;
    }

    public void setStateAbbr(String val) {
        this.stateAbbr = val;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String val) {
        this.countyName = val;
    }

    public int getCombinedFips() {
        return combinedFips;
    }

    public void setCombinedFips(int val) {
        this.combinedFips = val;
    }

    public String toString() {
        String output = "";

        output += votesDem + ", ";
        output += votesGOP + ", ";
        output += totalVotes + ", ";
        output += perDem + ", ";
        output += perGOP + ", ";
        output += diff + ", ";
        output += perPointDiff + ", ";
        output += stateAbbr + ", ";
        output += countyName + ", ";
        output += combinedFips;

        return output;
    }

}
