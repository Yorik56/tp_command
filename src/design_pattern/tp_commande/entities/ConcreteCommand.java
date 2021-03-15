package design_pattern.tp_commande.entities;

public class ConcreteCommand extends Command {

  private GlobalStock globalStock;
  private GlobalStock beforeExecute;

  public ConcreteCommand(final GlobalStock globalStock) {
    this.globalStock = globalStock;
  }

  @Override
  public boolean execute() throws CloneNotSupportedException {
    System.out.println("ConcreteCommand execute");
    this.beforeExecute = (GlobalStock) this.globalStock.clone();
    if (this.globalStock.getId() == 0 && this.globalStock.getData() == null) {
      this.globalStock.setId(1);
      this.globalStock.setData("data");
    }

    return true;
  }

  public void addStock() {

  }

  @Override
  public boolean undo() {
    System.out.println("ConcreteCommand undo");
    this.globalStock.setId(this.beforeExecute.getId());
    this.globalStock.setData(this.beforeExecute.getData());
    return true;
  }

  @Override
  public String toString() {
    return "ConcreteCommand [receiver=" + globalStock + "]";
  }
}