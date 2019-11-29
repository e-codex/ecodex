package eu.ecodex.pages;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ResourceHandler;
import org.eclipse.jetty.util.resource.Resource;

import java.awt.*;
import java.net.URI;

public class MainClass {



    public static Server createServer(int port)
    {
        Server server = new Server(port);

        // This has a connector listening on port specified
        // and no handlers, meaning all requests will result
        // in a 404 response
        ResourceHandler resHandler = new ResourceHandler();
        resHandler.setBaseResource(Resource.newClassPathResource("/page"));
        server.setHandler(resHandler);

        return server;
    }

    public static void main(String[] args) throws Exception
    {
        String portString = System.getProperties().getProperty("jetty.http.port", "0");
        int port = Integer.parseInt(portString);
        Server server = createServer(port);

        server.start();

        URI uri = server.getURI();
        System.out.println("URI: " + uri);

        if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
            Desktop.getDesktop().browse(uri);
        }

        server.join();
    }

}
