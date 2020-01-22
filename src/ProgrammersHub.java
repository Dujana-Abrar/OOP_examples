import java.util.ArrayList;

public class ProgrammersHub {
    public static void main(String[] args) {
        ArrayList<Prograammer> prograammers = new ArrayList<Prograammer>();
        prograammers.add(new SoftwareApplicationDeveloper());
        prograammers.add(new WebDeveloper());
        prograammers.add(new GameDeveloper());

        for (Prograammer prograammer : prograammers) {
            System.out.println(prograammer.writeACode());
        }
    }
}