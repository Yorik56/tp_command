package design_pattern.tp_commande.entities;

public abstract class Command {

  public abstract boolean execute() throws CloneNotSupportedException;

  public abstract boolean undo();
}