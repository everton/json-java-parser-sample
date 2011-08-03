import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.json.JSONException;
import org.json.JSONObject;

public class TestJSONObject {
   @Test
   public void testEmptyJsonReturnsAnEmptyHash() throws JSONException  {
       JSONObject h = new JSONObject("{}");
       assertEquals(0, h.length());
   }
}
