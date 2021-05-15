package sh.crzy;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.lang.System;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class Color {

	
    public static void main(String[] args) throws Exception {
		String PORT = System.getProperty("PORT", "8077");
		int port = Integer.parseInt(PORT);
		System.out.println(PORT);

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        server.createContext("/", new Handler());
        server.createContext("/kill", new StopHandler(server));
        server.setExecutor(null);
        server.start();
    }

    static class Handler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "{\"color\": \"red\"}";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

	static class StopHandler implements HttpHandler {

		HttpServer s;
		public StopHandler(HttpServer server) {	
			s = server;
		}

        @Override
        public void handle(HttpExchange t) throws IOException {
            String response = "ok";
            t.sendResponseHeaders(200, response.length());
            OutputStream os = t.getResponseBody();
            os.write(response.getBytes());
            os.close();
			s.stop(0);
        }
    }


}
