package com.mohamed.supplements.entities;


import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Nutritional {
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNut;
    private String nomNut;
    @JsonIgnore
    @OneToMany(mappedBy = "nutritional")
    private List<Supplement> supplements;
    public Nutritional(Long idNut, String nomNut) {
		super();
		this.idNut = idNut;
		this.nomNut = nomNut;
	}
    public long getIdNut() {
    return this.idNut;}
    public void setIdNut(long a) {
    	this.idNut=a;
    }
    public String getnomNut() {
        return this.nomNut;}
        public void setnomNut(String a) {
        	this.nomNut=a;
        }
        
    
}
