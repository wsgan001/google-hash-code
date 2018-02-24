package google.com.ortona.hashcode.data_center.logic.model;

public class Server {

  int id;

  public int getPool() {
    return pool;
  }

  public void setPool(int pool) {
    this.pool = pool;
  }

  public int getCapacity() {
    return capacity;
  }

  public int getSize() {
    return size;
  }

  private int capacity;

  public void setCapacity(int capacity) {
    this.capacity = capacity;
  }

  public void setSize(int size) {
    this.size = size;
  }

  private int size;
  private int pool;

  public Server(int id, int capacity, int size) {
    this.capacity = capacity;
    this.size = size;
  }

  @Override
  public String toString() {
    return id + "_[" + this.capacity + "," + this.size + "]";
  }

}
