import java.util.ArrayList;

class Thing{
    private String name;

    public Thing(String name){
        this.name = name;
    }
}

class Box {
    private ArrayList<Thing> contents = new ArrayList<Thing>();

    public Box(){System.out.println("Box créée");}

    public boolean add(Thing aAjouter){
        this.contents.add(aAjouter);
        return true;
    }

    public boolean contientTruc(Thing objetATester){
        if (this.contents.contains(objetATester)){
            return true;
        }
        return false;
    }
}