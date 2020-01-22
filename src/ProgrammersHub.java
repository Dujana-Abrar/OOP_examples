import java.util.ArrayList;

interface Programmer {
    public abstract String writeACode();
}

public class ProgrammersHub {
    public static void main(String[] args) {
        ArrayList<Programmer> programmers = new ArrayList<Programmer>();
        programmers.add(new SoftwareApplicationDeveloper());
        programmers.add(new WebDeveloper());
        programmers.add(new GameDeveloper());

        for (Programmer programmer : programmers) {
            System.out.println(programmer.writeACode());
        }
    }
}

  

class GameDeveloper implements Programmer {
    public String writeACode() {
        return "I love making gaames!!!!";
    }
}

class SoftwareApplicationDeveloper implements Programmer {
    public String writeACode() {
        return "I make applications for your devices!!!!";
    }
}

class WebDeveloper implements Programmer {
    public String writeACode() {
        return "I make websites!!!!1";
    }
}
