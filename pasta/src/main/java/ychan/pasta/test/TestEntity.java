package ychan.pasta.test;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name="test", schema="pasta")
public class TestEntity {

    @Id
    @Column(name="test_column")
    private String testColumn;

    @Column(name="test_column_2")
    private String testColumn2;

}
