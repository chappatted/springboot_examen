package ch.hearc.masrad.springboot.examen.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    String name;
    Integer resolution;

    @ManyToMany
    @JoinTable( name = "camera_phone",
            joinColumns = @JoinColumn(name = "phone_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "camera_id", referencedColumnName = "id"))
    private List<Phone> phones;

}
