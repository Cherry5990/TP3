import org.junit.*;
import static org.junit.Assert.assertEquals;

public class TestsBoxes {

    @Test
    public void testBoxCreate(){
        Box b = new Box();
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

        Assert.assertEquals(true, b.contientTruc(truc1));
        Assert.assertEquals(false, b.contientTruc(truc2));
        Assert.assertEquals(true, b.contientTruc(truc3)); 
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
        Assert.assertEquals(b2, b);
    }
}