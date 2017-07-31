class Library{
  private String name;
  private Book[] stock;



  public Library(String name){
    this.name = name;
    this.stock = new Book[1000];
  }

  public String getName(){
    return this.name;
  }


  public int bookCount(){
    int count = 0; 
    for(Book book : this.stock){
      if(book != null){
        count++;
      }
    }
    return count;
  }

}
