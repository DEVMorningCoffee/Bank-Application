package com.personal_project.bank_application.User;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long ID;

    @Column(name = "first_name", nullable = false)
    public String firstName;

    @Column(name="email", nullable = false, unique = true)
    public String email;

    @Column(name="last_name", nullable = false  )
    public String lastName;

    @Column(name = "saving_balance")
    public double savingBalance = 3000.25;

    @Column(name = "checking_balance")
    public double checkingBalance = 1000.87;

    @Column(name="bank_id")
    public int bankID;

    // Remove ID to create randomize User with unique ID
    public User(String firstName, String lastName, int BankID, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bankID = BankID;
        this.email = email;

    }
}
