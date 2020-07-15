package com.ilkaygunel.domain;

import java.io.Serializable;

public class LineItem implements Serializable {
	private Product product;
	private int qty;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
