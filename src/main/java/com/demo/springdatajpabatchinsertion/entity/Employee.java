package com.demo.springdatajpabatchinsertion.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "EMPLOYEETable")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long empId;
    private String empName;
}
