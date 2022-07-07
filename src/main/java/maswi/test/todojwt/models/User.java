package maswi.test.todojwt.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Setter
@Getter
public class User {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "id_sequence", sequenceName = "USER_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_sequence")
    Long id;
    String name;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "User_Todos", joinColumns = @JoinColumn(name = "todo_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"))
    List<Todo> todos;
}
