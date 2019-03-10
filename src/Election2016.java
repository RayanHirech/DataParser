public class Election2016 {

    private ElectionResults electionResults;

    private double demVotes;
    private double gopVotes;
    private double totalVotes;

    public Election2016() {

    }

    public double getDemVotes() {
        return demVotes;
    }
    public double getGopVotes() {
        return gopVotes;
    }
    public double totalVotes() {
        return totalVotes;
    }

    public void setDemVotes(double d) {
        this.demVotes = d;
    }
    public void setGopVotes(double g) {
        this.gopVotes = g;
    }
    public void setTotalVotes(double t) {
        this.totalVotes = t;
    }

}
