public abstract class Console implements iConsole{
    protected String consoleType;
    protected String storeName;
    protected int TotalSales;

    public Console(String consoleType, String storeName, int TotalSales){
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.TotalSales = TotalSales;
    }

    protected Console() {
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return "";
    }

    @Override
    public int getTotalSales() {
        return TotalSales;
    }
}
