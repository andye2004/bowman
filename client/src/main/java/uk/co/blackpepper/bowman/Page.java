package uk.co.blackpepper.bowman;

import java.util.List;

import org.springframework.hateoas.PagedResources.PageMetadata;

public class Page<T> {

	private final List<T> resources;
	private final PageMetadata pageMetadata;

	public Page(List<T> resources, PageMetadata pageMetadata) {
		this.resources = resources;
		this.pageMetadata = pageMetadata;
	}

	public List<T> getResources() {
		return resources;
	}

	public long getElementsPerPage() {
		return pageMetadata.getSize();
	}

	public long getTotalElements() {
		return pageMetadata.getTotalElements();
	}

	public long getTotalPages() {
		return pageMetadata.getTotalPages();
	}

	public long getCurrentPage() {
		return pageMetadata.getNumber();
	}
}
