package io.perasoft.springbootliquibase.entity;

import io.perasoft.springbootliquibase.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Getter
@Setter
public class Country extends BaseEntity {

    @Column(nullable = false, length = 10)
    private String name;

    @Column(nullable = false, unique = true, length = 1)
    private String code;

    @OneToMany(mappedBy = "country")
    private List<City> cities;
}
