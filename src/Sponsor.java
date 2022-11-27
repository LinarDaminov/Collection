public class Sponsor<T> {
    private String SponsorsName;
    private double SponsorsMoney;


    public void sponsorship() {
        System.out.println("Я спонсирую заезд на " + getSponsorsMoney() + " рублей");
    }
    public Sponsor(String sponsorsName, double sponsorsMoney) {
        SponsorsName = sponsorsName;
        SponsorsMoney = sponsorsMoney;
    }

    public String getSponsorsName() {
        return SponsorsName;
    }

    public void setSponsorsName(String sponsorsName) {
        SponsorsName = sponsorsName;
    }

    public double getSponsorsMoney() {
        return SponsorsMoney;
    }

    public void setSponsorsMoney(double sponsorsMoney) {
        SponsorsMoney = sponsorsMoney;
    }

    @Override
    public String toString() {
        return "Спонсор: " + SponsorsName + ", Сумма спонсорства: " + SponsorsMoney;
    }
}

