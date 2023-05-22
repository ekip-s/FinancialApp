package ru.finansicli.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Apply_to_frendslist")
public class AccountSharing {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "status")
    @Enumerated(EnumType.ORDINAL)
    private SharingStatus status;
    @Column(name = "comment")
    private String comment;
    @ManyToOne
    @JoinColumn(name = "master_id", referencedColumnName = "id")
    private Person master;
    @ManyToOne
    @JoinColumn(name = "slave_id", referencedColumnName = "id")
    private Person slave;
    @Column(name = "creation_dt")
    @DateTimeFormat(pattern = "yyyy-MM-ddTHH:mm:ss")
    private LocalDateTime creationDT;
    @Column(name = "version")
    private int version;

    @Override
    public String toString() {
        return "AccountSharing{" +
                "id=" + id +
                ", status=" + status +
                ", comment='" + comment + '\'' +
                ", master=" + master +
                ", slave=" + slave +
                ", creationDT=" + creationDT +
                ", version=" + version +
                '}';
    }
}
