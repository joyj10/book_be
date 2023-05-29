package com.won.book.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "want-book")
public class WantBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(columnDefinition = "TEXT")
    private String reason;

    @Column(nullable = false)
    private Boolean readFlag;

    @CreatedDate
    @Column(nullable = false, updatable = false)
    private LocalDate createdDate;

    @Column(nullable = false)
    private Long bookId;
}
