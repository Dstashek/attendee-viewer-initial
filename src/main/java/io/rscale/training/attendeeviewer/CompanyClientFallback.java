package io.rscale.training.attendeeviewer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.hateoas.PagedResources;
import org.springframework.web.bind.annotation.Override;
import org.springframework.web.bind.annotation.Component;


@Component
public class CompanyClientFallback implements CompanyClient {

	@Override
	public PagedResources<Company> getCompanies(int page) {
		List<Company> companies = new ArrayList<Company>();
		companies.add(new Company());
		return new PagedResources<Company>(companies, new PageMetadata(1, 1, 1, 1), new Link("/"));
	}

	@Override
	public Company getCompany(String companyId) {
		return new Company();
	}

}