package design_pattern.tp_commande.entities;

import java.util.ArrayList;

public class GlobalStock {

		private ArrayList<Stock> Stock = new ArrayList<Stock>();

		private long id;

		private String data;

	  	public ArrayList<Stock> getStock() {
			return Stock;
		}

		public void setStock(ArrayList<Stock> stock) {
			Stock = stock;
		}



	  // Action 1
	  public long getId() {
	    return id;
	  }

	  // Action 2
	  public void setId(long id) {
	    this.id = id;
	  }

	  // Action 3
	  public String getData() {
	    return data;
	  }

	  // Action 4
	  public void setData(String data) {
	    this.data = data;
	  }

	  @Override
	  public String toString() {
	    return "Receiver [id=" + id + ", data=" + data + "]";
	  }

	  @Override
	  protected Object clone() throws CloneNotSupportedException {
	    GlobalStock result = new GlobalStock();
	    result.setId(this.getId());
	    result.setData(this.getData());
	    return result;
	  }


}
