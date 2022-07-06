package maswi.test.todojwt.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class Route {
    @NonNull
    String name;
    @NonNull
    String method;
    @NonNull
    String path;
    String description;
}
