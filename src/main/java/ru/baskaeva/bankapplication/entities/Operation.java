package ru.baskaeva.bankapplication.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private Card cardFrom;
    @OneToOne
    private Card cardTo;
    private Long amount;

    @ManyToOne
    private OperationHistory history;
    private OperationType operationType;
}
