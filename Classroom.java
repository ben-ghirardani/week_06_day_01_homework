class Classroom{

  private String name;
  private Person[] room;


  public Classroom(String name){
    this.name = name;
    this.room = new Person[10];
  }

  public int personCount(){
    int count = 0;
    for ( Person person : this.room ){
      if(person != null) {
        count++;
      }
    }
    return count;
  }

}