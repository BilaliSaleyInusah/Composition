public class MotherBoard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSlots;
    private String bios;

    //constructor
    public MotherBoard(String model, String manufacturer, int ramSlots, int cardSlots, String bios){
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSlots = cardSlots;
        this.bios =bios;
    }

    // method
    public void loadProgram(String program){
        System.out.println("Program : " + program + " is loading ...");
    }

    // getters metho
    public String getModel() {
        return model;
    }
    public String getManufacturer() {
        return manufacturer;
    }
    public int getRamSlots() {
        return ramSlots;
    }
    public int getCardSlots() {
        return cardSlots;
    }
    public String getBios() {
        return bios;
    }

}
