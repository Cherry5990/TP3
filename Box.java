import java.util.ArrayList;

class Thing{
    private String name;
    private int volume;

    public Thing(String name){
        this.name = name;
        this.volume = 0;
    }

    public Thing(int volume){
        this.name = "something";
        this.volume = volume;
    }

    public Thing(String name, int volume){
        this.name = name;
        this.volume = volume;
    }

    public String getName(){
        return this.name;
    }

    public int getVolume(){
        return this.volume;
    }

    @Override 
    public String toString(){
        return this.getName();
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
    private ArrayList<Thing> contents;
    private boolean estOuverte;

    public Box(){
        this.contents = new ArrayList<Thing>();
        this.estOuverte = false;
        System.out.println("Box créée");
    }

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

    public boolean isOpen(){
        return this.estOuverte;
    }

    public void open(){
        this.estOuverte = true;
    }

    public void close(){
        this.estOuverte = false;
    }

    public String actionLook(){
        String retourLook = "La boite est fermée";
        if (this.isOpen()){
            retourLook = "La boite contient : ";
            //String listString = String.join(", ", this.contents);
            int cpt = 0;
            for (Thing thing : this.contents){
                retourLook = retourLook + " " + thing.getName();
                ++cpt;
                if (cpt < this.contents.size()){
                    retourLook = retourLook + ",";
                }
            }
        }
        return retourLook;
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