package com.mohamed.supplements.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "nomSupp", types = { Supplement.class })


public interface SupplementProjection {
	public String getNomSupplement();

}
