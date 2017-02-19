package co.kukurin.toptal;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Getter
public class TopTalentEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    public TopTalentEntity(String name) {
        this.name = name;
    }

}
