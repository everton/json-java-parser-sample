import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.util.Hashtable;

public class TestJsonWalker {
   @Test
   public void testEmptyJsonReturnsAnEmptyHash() {
       Hashtable h = JsonWalker.walk("{}");
       assertEquals(new Hashtable(), h);
   }
}
