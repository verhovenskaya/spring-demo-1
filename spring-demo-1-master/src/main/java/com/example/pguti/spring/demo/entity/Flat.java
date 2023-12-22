package com.example.pguti.spring.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Table(name = "flats")
public class Flat {
    private final static int DEFAULT_SQUARE = 50;
    private final static int DEFAULT_QUANTITY = 2;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "square", nullable = false)
    private int square;
    @Column(name = "quantity", nullable = false)
    private int quantity;

    public Flat() {
        this.square = DEFAULT_SQUARE;
        this.quantity = DEFAULT_QUANTITY;
    }

    public Flat(int square) {
        this.square = square;
        this.quantity = DEFAULT_QUANTITY;
    }
}
