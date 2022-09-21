public class Main {
    public static void main(String[] args) {
        MusicStyles popBand = new PopMusic("Pink Floyd", "Roger Waters ", "Syd Barrett ","David Gilmour",
                "Richard Wright","Nick Mason");

        MusicStyles rockBand = new RockMusic("Imagine Dragons", "Dan Reynolds", "Wayne Sermon ",
                "Ben McKee ", "Daniel Platzman ");

        MusicStyles classicBand = new ClassicMusic("Ludovico Einaudi "," Federico Mecozzi", "Redi Hasa" );



        MusicStyles[] musicStyles = {popBand,rockBand,classicBand};
        for ( MusicStyles playMusic : musicStyles){
            playMusic.makeSound();

        }


    }

}