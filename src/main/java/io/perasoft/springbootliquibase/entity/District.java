package io.perasoft.springbootliquibase.entity;

import io.perasoft.springbootliquibase.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class District extends BaseEntity {

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, unique = true, length = 4)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id", nullable = false)
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Neighborhood> neighborhoods;
}
