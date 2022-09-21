public class PopMusic extends MusicStyles{
    private String bassGuitar;

    public PopMusic(String bandName, String bassGuitar,String vocalist, String guitar,String keyboards, String drummer) {
        super.setBandName(bandName);
        super.setVocalist(vocalist);
        super.setGuitar(guitar);
        super.setKeyboards(keyboards);
        super.setDrummer(drummer);
        this.bassGuitar=bassGuitar;

    }

    @Override
    public void makeSound() {
        System.out.println("Play pop by " + getBandName());
    }

    public String getBassGuitar() {
        return bassGuitar;
    }

    public void setBassGuitar(String bassGuitar) {
        this.bassGuitar = bassGuitar;
    }

}
