class Bus{
  private String name;
  private int number;
  private Person[] passengers;


  public Bus(String name, int number){
    this.name = name;
    this.number = number;
    this.passengers = new Person[5];
  }


}