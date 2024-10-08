package com.example.persona.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

@Entity
@Table(name ="localidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Localidad extends Base{
    private String denominacion;
}
