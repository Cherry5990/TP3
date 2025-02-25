import java.util.ArrayList;

public class Box {

    ArrayList<String> contents = new ArrayList<String>();

    public Box(){System.out.println("Box créée");}

    public void add(String aAjouter){
        this.contents.add(aAjouter);
    }
}