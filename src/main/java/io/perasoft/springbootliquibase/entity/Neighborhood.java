package io.perasoft.springbootliquibase.entity;

import io.perasoft.springbootliquibase.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Neighborhood extends BaseEntity {

    @Column(nullable = false, length = 80)
    private String name;

    @Column(nullable = false, unique = true, length = 7)
    private String code;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "district_id", nullable = false)
    private District district;
}
