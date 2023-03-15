public class PetrolPurchase {

    private String stationLocation;
    private String petrol;
    private int quantityInLitres;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrol, int quantityInLitres, double pricePerLitre, double percentageDiscount) {

        this.stationLocation = stationLocation;
        this.petrol = petrol;
        this.quantityInLitres = quantityInLitres;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchaseAmount() {
        double purchaseAmount = quantityInLitres * pricePerLitre - percentageDiscount;
        return purchaseAmount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public int getQuantityInLitres() {
        return quantityInLitres;
    }

    public void setQuantityInLitres(int quantityInLitres) {
        this.quantityInLitres = quantityInLitres;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }
}
