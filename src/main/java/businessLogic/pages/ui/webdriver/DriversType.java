package businessLogic.pages.ui.webdriver;

public enum DriversType {
    FIREFOX("firefox"), CHROM("chrom");
    private String driverName;

    //designer
    private DriversType(String driverName) {
        this.driverName = driverName;
    }

       public String getDriverName() {
        return this.driverName;
    }
}
