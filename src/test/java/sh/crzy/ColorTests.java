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
	@DisplayName("Check GET on /")
    void test() throws IOException,  InterruptedException {
		String PORT = System.getProperty("PORT", "8077");
		System.out.println(PORT);
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
