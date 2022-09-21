public class RockMusic extends MusicStyles {
    public RockMusic(String bandName, String vocalist, String guitar,String keyboards,String drummer) {
        super.setBandName (bandName);
        super.setDrummer(drummer);
        super.setVocalist(vocalist);
        super.setGuitar(guitar);
        super.setKeyboards(keyboards);

    }


    @Override
    public void makeSound() {
        System.out.println("Play rock by" + getBandName());
    }
}
