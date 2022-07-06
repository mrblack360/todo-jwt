package maswi.test.todojwt.models;

import java.util.ArrayList;
import java.util.List;

public class RoutesDescription {
    public List<Route> routes=new ArrayList<Route>();

    public RoutesDescription() {
        Route rootRoute = new Route("root", "GET", "/", "Returns all the routes available in this application.");
        Route GetAlltodosRoute = new Route("Get All Todos", "GET", "/todo", "Returns all the todos available.");
        Route CreateTodoRoute = new Route("Create Todo", "POST", "/todo", "Create one todo");
        Route EditTodoRoute = new Route("Edit Todo", "PUT", "/todo/{id}", "Edit the todo for the given ID");
        Route DeleteTodoRoute = new Route("Delete Todo", "DELETE", "/todo/{id}", "Delete the todo for the given ID");
        routes.add(rootRoute);
        routes.add(GetAlltodosRoute);
        routes.add(CreateTodoRoute);
        routes.add(EditTodoRoute);
        routes.add(DeleteTodoRoute);
    }
}
