public class Main {
    public static void main(String[] args) {
        MusicStyles popBand = new PopMusic("Pink Floyd", "Roger Waters ", "Syd Barrett ","David Gilmour",
                "Richard Wright","Nick Mason");

        MusicStyles rockBand = new RockMusic("Imagine Dragons", "Dan Reynolds", "Wayne Sermon ",
                "Ben McKee ", "Daniel Platzman ");

        MusicStyles[] musicStyles = {popBand,rockBand};
        for ( MusicStyles playMusic : musicStyles){
            playMusic.makeSound();

        }


    }

}