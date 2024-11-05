package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;



@Entity
@Getter
@Setter
  public class Produto {

         @Id
         @GeneratedValue(strategy = GenerationType.IDENTITY)
         private long id;

         private String nome;
         private Double preco;
         private Integer quantidade;



}
