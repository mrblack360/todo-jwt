package maswi.test.todojwt.models;

public class RoutesDescription {
    public Route[] routes = new Route[20];

    public RoutesDescription() {
        Route rootRoute = new Route("root", "GET", "/", "Returns all the routes available in this application.");
        routes[0] = rootRoute;
    }
}
