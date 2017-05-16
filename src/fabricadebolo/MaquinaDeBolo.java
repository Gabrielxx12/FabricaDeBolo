package fabricadebolo;
public class MaquinaDeBolo {
  public String sabor;
  public String cobertura;
  private String recheio;
  
   public void fazerBolo(String sabor){
      this.sabor = sabor;
      System.out.println("Bolo feito!Sabor "+this.sabor); 
   }
   public String getRecheio(){
    return this.recheio;
   }
   public void setRecheio(String recheio){
    this.recheio = recheio;
   }
}


