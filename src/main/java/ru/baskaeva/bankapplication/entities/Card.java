package ru.baskaeva.bankapplication.entities;

import lombok.*;
import jakarta.persistence.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String cardNumber;
    private String validTill;
    @ManyToOne
    private User user;
    private String code;
    @ManyToOne
    private Wallet wallet;
    private Long balance;
}