class Bus{
  private String name;
  private int number;
  private Person[] passengers;


  public Bus(String name, int number){
    this.name = name;
    this.number = number;
    this.passengers = new Person[5];
  }

  public int countPassengers(){
    int count = 0;
      for( Person person : this.passengers ){
        if ( person != null) {
          count++;
        }
      }
      return count;
  }

  public void pickup(Person person){
    if(busIsFull()){
      return;
    }
    int countPassengers = countPassengers();
    passengers[countPassengers] = person;
  }

  public boolean busIsFull(){
    return countPassengers() == passengers.length;
  }

}