package maswi.test.todojwt.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Todos")
@Setter
@Getter
public class Todo {
    String name;
    @Id
    @Column(name="id")
    @SequenceGenerator(name = "id_Sequence", sequenceName = "TODO_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "id_Sequence") 
    public Long id;

}
