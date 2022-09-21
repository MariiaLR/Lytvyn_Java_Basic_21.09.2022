public class ClassicMusic extends MusicStyles{

    private String compositor;
    private String cellist;
    private String violinist;

    public ClassicMusic(String compositor, String cellist, String violinist) {
        this.compositor = compositor;
        this.cellist = cellist;
        this.violinist = violinist;
    }

    @Override
    public void makeSound() {
        System.out.println("Play classic by " + getBandName());
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getCellist() {
        return cellist;
    }

    public void setCellist(String cellist) {
        this.cellist = cellist;
    }

    public String getViolinist() {
        return violinist;
    }

    public void setViolinist(String violinist) {
        this.violinist = violinist;
    }

}
