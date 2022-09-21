public class MusicStyles {
    private String bandName;
    private String vocalist;
    private String guitar;
    private String keyboards;
    private String drummer;


    public void makeSound (){
        System.out.println();
    }

    public String getVocalist() {
        return vocalist;
    }

    public void setVocalist(String vocalist) {
        this.vocalist = vocalist;
    }

    public String getGuitar() {
        return guitar;
    }

    public void setGuitar(String guitarPlayer) {
        this.guitar = guitarPlayer;
    }

    public String getKeyboards() {
        return keyboards;
    }

    public void setKeyboards(String keyboards) {
        this.keyboards = keyboards;
    }

    public String getDrummer() {
        return drummer;
    }

    public void setDrummer(String drummer) {
        this.drummer = drummer;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

}
