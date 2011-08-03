import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;

public class TestJSONObject {
    private String jsonSource;

    @Before
    public void setUp() throws Exception {
        String   fixtName = "fixtures/post.json";
        File         file = new File(fixtName);
        FileReader     fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        jsonSource = "";
        String text = null;
        while ((text = br.readLine()) != null)
            jsonSource += text;
    }

    @Test
    public void testEmptyJsonReturnsAnEmptyJSONObject() throws JSONException  {
        JSONObject h = new JSONObject("{}");
        assertEquals(0, h.length());
    }

    @Test
    public void testAssinaturaJSON() throws JSONException  {
        String expectedTitle = "My Test Post";
        String expectedBody  = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";

        JSONObject post = new JSONObject(jsonSource);
        assertEquals(4,              post.length());

        assertEquals(123456789,     post.getDouble("id"), 0);

        assertEquals(expectedTitle, post.get("title"));
        assertEquals(expectedBody,  post.get("body"));

        JSONObject author = post.getJSONObject("author");
        assertEquals("John", author.get("name"));
    }
}
