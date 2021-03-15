package design_pattern.tp_commande.entities;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Client {

  private Invoker invoker = new Invoker();

  private ArrayList<Stock> GlobalStocks = new ArrayList<Stock>();


  public void executeCommand(Command command) throws CloneNotSupportedException {
    if (command.execute()) {
      this.invoker.push(command);
    }
  }

 public void addStock() {

 }

  public void undo() {
    if (this.invoker.isEmpty())
      return;

    Command command = invoker.pop();
    if (command != null) {
      command.undo();
    }
  }

  public void showHistory() {
    this.invoker.showHistory();
  }



}