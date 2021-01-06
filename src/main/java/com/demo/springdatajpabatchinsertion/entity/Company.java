package com.demo.springdatajpabatchinsertion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "COMPANYTable")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Company implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cmpId;
    private String cmpName;

    @OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name="cid",referencedColumnName = "cmpId")
    private List<Employee> employeeList = new ArrayList<>();


}
