package org.example;

    import com.sun.net.httpserver.HttpExchange;
    import com.sun.net.httpserver.HttpHandler;
    import com.sun.net.httpserver.HttpServer;

    import java.io.IOException;
    import java.io.OutputStream;
    import java.net.InetSocketAddress;
    import java.util.concurrent.Executor;
    import java.util.concurrent.Executors;
public class Main {
    public static void main (String[] args) throws IOException
    {
        public class Main {
            public static void main (String[] args) throws IOException
            {
                HttpServer httpServer = HttpServer.create(new InetSocketAddress("Localhost", 8074), 0);

                httpServer.createContext("/ecommerce", new ecommerceHandler());
                httpServer.setExecutor(Executors.newSingleThreadExecutor());
                httpServer.start();
            }
            public static class ecommerceHandler implements HttpHandler {
                @Override
                public void handle(HttpExchange exchange) throws IOException {
                    //post
                    //get
    }