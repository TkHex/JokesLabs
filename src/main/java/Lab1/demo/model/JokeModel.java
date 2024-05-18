package Lab1.demo.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "joke")
@Table(name = "joke_redact")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JokeModel {

    @Id
    @Column(name = "joke_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "joke")
    private String textJoke;

    @CreationTimestamp
    @Column(name = "add_joke")
    private LocalDateTime dateAddJoke;

    @CreationTimestamp
    @Column(name = "change_joke")
    private LocalDateTime dateChangeJoke;

}
