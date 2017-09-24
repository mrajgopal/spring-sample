package org.techie.domain;


import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Product {
    @Id
    private Integer id;

    @Version
    private Integer version;
    private String productId;
    private List<MobileCompany<?>> companies;
    
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

	public List<MobileCompany<?>> getCompanies() {
		return companies;
	}

	public void setCompanies(List<MobileCompany<?>> companies) {
		this.companies = companies;
	}

	


}
