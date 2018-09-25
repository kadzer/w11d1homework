public class Printer {
    private int numOfSheets;
    private int tonerVolume;

    public Printer(int numOfSheets, int tonerVolume) {
        this.numOfSheets = numOfSheets;
        this.tonerVolume = tonerVolume;
    }

    public int getNumOfSheets() {
        return numOfSheets;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        int pagesToPrint = pages * copies;
        if (this.numOfSheets >= pagesToPrint){
        this.numOfSheets = numOfSheets - pagesToPrint;
        this.tonerVolume = tonerVolume - pagesToPrint;
        }
        else {
            System.err.println("PC LOAD LETTER!!! Add more paper to print");
        }
    }
}
