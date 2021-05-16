package sh.crzy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ColorTests {

    @Test
	@DisplayName("Check listening PORT is set to 8101")
    void testPort() throws IOException,  InterruptedException {
		int PORT = Color.getPort();
		assertEquals(8101, PORT, "should return 8101");
    }

	@Test
	@DisplayName("Check GET on / returns color")
    void testURL() throws IOException,  InterruptedException {
		int PORT = Color.getPort();
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:"+PORT))
				.GET()
                .build();

        HttpResponse<String> response = client.send(request,
                HttpResponse.BodyHandlers.ofString());
		assertEquals(200, response.statusCode(), "should return 200");
		assertEquals("{\"color\": \"red\"}", response.body(), "should return red");		
    }

}
