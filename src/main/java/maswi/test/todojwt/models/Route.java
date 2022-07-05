package maswi.test.todojwt.models;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
public class Route {
    @NonNull
    @Setter
    String name;
    @NonNull
    @Setter
    String method;
    @NonNull
    @Setter
    String path;
    @Setter
    String description;
}
