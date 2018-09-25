public class Printer {
    private int paperCount;
    private int tonerVolume;

    public Printer(int paperCount, int tonerVolume) {
        this.paperCount = paperCount;
        this.tonerVolume = tonerVolume;
    }

    public int getPaperCount() {
        return paperCount;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        int pagesToPrint = pages * copies;
        if (this.paperCount >= pagesToPrint){
        this.paperCount = paperCount - pagesToPrint;
        this.tonerVolume = tonerVolume - pagesToPrint;
        }
        else {
            System.err.println("PC LOAD LETTER!!! Add more paper to print");
        }
    }
}
