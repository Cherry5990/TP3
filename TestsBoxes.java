import org.junit.*;
import static org.junit.Assert.assertEquals;
//import com.google.gson.Gson;

public class TestsBoxes {

    @Test
    public void testBoxCreate(){
        Box b = new Box();
        b.isOpen();
    }

    @Test
    public void testBoxAdd(){
        Box b = new Box();
        Thing truc1 = new Thing("chaussette");
        Thing truc2 = new Thing("chaussure");
        b.add(truc1);
        b.add(truc2);
    }

    @Test
    public void testBoxContient(){
        Box b = new Box();
        Thing truc1 = new Thing("chaussette");
        Thing truc2 = new Thing("chaussure");
        Thing truc3 = new Thing("chaussette");
        b.add(truc1);

        assertEquals(true, b.contientTruc(truc1));
        assertEquals(false, b.contientTruc(truc2));
        assertEquals(true, b.contientTruc(truc3)); 
    }

    @Test
    public void testRetireTruc(){
        Box b = new Box();
        Thing truc1 = new Thing("chaussette");
        Thing truc2 = new Thing("chaussure");
        b.add(truc1);
        b.add(truc2);

        Box b2 = new Box();
        b2.add(truc2);

        b.retireTruc(truc1);
        assertEquals(b2, b);
    }

    @Test
    public void testOuverture(){
        Box b = new Box();
        assertEquals(false, b.isOpen());

        b.open();
        assertEquals(true, b.isOpen());
        
        b.close();
        assertEquals(false, b.isOpen());
    }

    @Test
    public void testActionLook(){
        Box b = new Box();
        assertEquals("La boite est fermée", b.actionLook());

        Thing truc1 = new Thing("chaussette");
        Thing truc2 = new Thing("chaussure");
        b.add(truc1);
        b.add(truc2);
        
        assertEquals("La boite est fermée", b.actionLook());
        b.open();
        assertEquals("La boite contient : chaussette, chaussure", b.actionLook());
        
    }
}