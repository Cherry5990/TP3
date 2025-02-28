import java.util.ArrayList;

class Thing{
    private String name;

    public Thing(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object autreObject){
        if (autreObject == null){return false;}

        if (autreObject == this){return true;}

        if (!(autreObject instanceof Thing)){return false;}

        Thing temp = (Thing) autreObject;
        return this.name == temp.name;
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

    public void retireTruc(Thing objetATester){
        if (this.contientTruc(objetATester)){this.contents.remove(objetATester);}
    }

    @Override
    public boolean equals(Object autreObject){
        if (autreObject == null){return false;}

        if (autreObject == this){return true;}

        if (!(autreObject instanceof Box)){return false;}

        Box temp = (Box) autreObject;
        return this.contents.equals(temp.contents);
    }
}