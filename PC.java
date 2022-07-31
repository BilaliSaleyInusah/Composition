public class PC {
    private MotherBoard motherBoard;
    private Case thisCase;
    private Monitor monitor;


    // constructor
    public PC (MotherBoard motherBoard , Case thisCase , Monitor monitor){
        this.motherBoard = motherBoard;
        this.thisCase = thisCase; 
        this.monitor = monitor;
    }
    
    // calling loadProgram from motherBoard class into pc class
    public void loadProgram(String program){
        motherBoard.loadProgram(program);;
    }

    // getters method
    public MotherBoard getMotherBoard() {
        return motherBoard;
    }
    public Case getThisCase() {
        return thisCase;
    }
    public Monitor getMonitor() {
        return monitor;
    }
    
}
