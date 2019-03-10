public class County {

    private String name;
    private int fips;
    private Election2016 vote2016;
    private Education2016 educ2016;
    private Employment2016 employ2016;

    public County() {

    }

    public String getName() {
        return name;
    }
    public int getFIPS() {
        return fips;
    }
    public Election2016 getElectionData() {
        return vote2016;
    }
    public Education2016 getEducationData() {
        return educ2016;
    }
    public Employment2016 getEmploymentData() {
        return employ2016;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setFIPS(int fips) {
        this.fips = fips;
    }
    public void setElectionData(Election2016 e) {
        this.vote2016 = e;
    }
    public void setEducationData(Education2016 e) {
        this.educ2016 = e;
    }
    public void setEmploymentData(Employment2016 e) {
        this.employ2016 = e;
    }

}
