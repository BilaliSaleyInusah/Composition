public class Case {
    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions diemensions;

    //constructor
    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions){
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.diemensions = dimensions;
    }

    // method
    public void pressPowerButton(){
        System.out.println("Power button pressed");
    }

    // getters method
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public String getPowerSupply() {
        return powerSupply;
    }
    public Dimensions getDiemensions() {
        return diemensions;
    }
}
