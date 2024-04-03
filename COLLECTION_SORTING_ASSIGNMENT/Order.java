package collectionandsortingassignment;

import java.time.LocalDate;

public class Order {
	private Long id;
	private String status;
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	//private Customer customer;
	private Long customerId;
	private Product prodList;
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(Long id , LocalDate orderDate, LocalDate deliveryDate,String status, Long customerId) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.customerId = customerId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public Product getProdList() {
		return prodList;
	}
	public void setProdList(Product prodList) {
		this.prodList = prodList;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate
				+ ", customerId=" + customerId + ", prodList=" + prodList + "]";
	}
	
	
	
	
	
	

	

}
