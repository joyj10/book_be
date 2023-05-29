package com.won.book.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "read-book")
public class ReadBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column
    private float rating;

    @Column(columnDefinition = "TEXT")
    private String review;

    @Column(nullable = false)
    private LocalDate readDate;

    @Column(nullable = false)
    private int readYear;

    @Column(nullable = false)
    private int readMonth;

    @Column(nullable = false)
    private int readWeek;

    @Column
    private LocalDate updatedDate;

    @Column(nullable = false)
    private Long bookId;
}
