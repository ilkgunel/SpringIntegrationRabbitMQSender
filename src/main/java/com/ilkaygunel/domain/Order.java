package com.ilkaygunel.domain;

import java.io.Serializable;
import java.util.List;


public class Order implements Serializable {
	private String id;
	private List<LineItem> items;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}
}
