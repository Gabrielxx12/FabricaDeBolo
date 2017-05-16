package fabricadebolo;
public class FabricaDeBolo {
    public static void main(String[] args) {
      MaquinaDeBolo maq = new MaquinaDeBolo();
      MaquinaDeBoloModerna maqM = new MaquinaDeBoloModerna();
   
      maq.fazerBolo("Chocolate"); 
      
      maqM.fazerBolo("Cenoura");
      maqM.fazerBolo("Laranja","Chocolate");
      maqM.fazerBolo("Milho","Morango","Banana");
    }
    
}
