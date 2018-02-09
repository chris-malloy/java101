package com.chrismalloy;

public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel >= 0 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.pagesPrinted = pagesPrinted;
        this.duplex = duplex;
    }

    public void fillToner(){
        this.tonerLevel = 100;
        System.out.println("Toner level is now " + this.tonerLevel + "%.");
    }

    public void printPage(){
        if(this.duplex == true){
            this.tonerLevel -= 20;
        } else {
            this.tonerLevel -= 10;
        }
        this.pagesPrinted += 1;
        System.out.println(this.pagesPrinted + " pages have been printed.");
        System.out.println("Toner level remaining is " + this.tonerLevel + "%.");
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
