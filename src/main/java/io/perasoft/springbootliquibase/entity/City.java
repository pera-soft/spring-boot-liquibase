package io.perasoft.springbootliquibase.entity;

import io.perasoft.springbootliquibase.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseEntity {

    @Column(nullable = false, length = 14)
    private String name;

    @Column(nullable = false, unique = true, length = 2)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "country_id", nullable = false)
    private Country country;

    @OneToMany(mappedBy = "city")
    private List<District> districts;

    @Column(nullable = false)
    private String licencePlateCode;

}
