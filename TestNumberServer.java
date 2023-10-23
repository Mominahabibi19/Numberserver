import static org.junit.Assert.*;
import org.junit.*;
import java.net.URI;
import java.net.URISyntaxException;

public class TestNumberServer{
  @Test
  public void testIncrement () throws URISyntaxException {
 Handler h = new Handler();
    URI increment = new URI("http://localhost/increment");
    URI rootPath = new URI("http://localhost/");
    assertEquals("Number incremented!", h.handleRequest(increment));
    assertEquals("Number:1 ", h.handleRequest(rootPath));
    
      assertEquals(, h.handleRequest(increment));
    assertEquals(, h.handleRequest(rootPath));
    
  } 
}
  
