package design_pattern.tp_commande.entities;

public class Stock {
	private GlobalStock ParentGlobalStock;
	private String name;
	private Integer quantity = 0;

	public GlobalStock getParentGlobalStock() {
		return ParentGlobalStock;
	}
	public void setParentGlobalStock(GlobalStock parentGlobalStock) {
		ParentGlobalStock = parentGlobalStock;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
