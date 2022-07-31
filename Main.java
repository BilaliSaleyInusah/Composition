public class Main {

    public static void main(String[] args) {
        // creating motherBoard objact
        MotherBoard motherBoard = new MotherBoard("amd", "Amd", 4, 4, "bois");

        // creating resolution objact // which will be pass into monitor
        Resolution nativeResolution = new Resolution(20, 15);

        // creating monitor objact
        Monitor monitor = new Monitor("Dell", "Dell_man", 20, nativeResolution);

        // creating dimensions objact 
        Dimensions dimensions = new Dimensions(10, 12, 8);

        // creating Case object
        Case thisCase = new Case("Dell_case", "Dell_case_man", "ECG", dimensions);

        // creating pc objact 
        PC pc = new PC(motherBoard, thisCase, monitor);

        // calling loadProgram from motherBoard classs
        pc.getMotherBoard().loadProgram("Bilal");
        // calling loadProgram from pc class which is also calling it from  motherBoard classs
        pc.loadProgram("Game");

        pc.getMonitor().drawPixelAt(10, 5, "red");

    }
}