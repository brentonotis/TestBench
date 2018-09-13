
public class CallInventoryTag {
   public static void main (String [] args) {
      InventoryTag redSweater = new InventoryTag();
      int sweaterShipment = 0;
      int sweaterInventoryBefore = 0;

      sweaterInventoryBefore = redSweater.getQuantityRemaining();
      sweaterShipment = 25;

      System.out.println("Beginning tests.");

      redSweater.addInventory(sweaterShipment);
      if (redSweater.getQuantityRemaining() != sweaterShipment + sweaterInventoryBefore) {
    	  System.out.println("   UNIT TEST FAILED: addInventory()");
      }

      System.out.println("Tests complete.");

      return;
   }
}