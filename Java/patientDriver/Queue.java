package pasientdriver;

// 
// Josh Jerge 
// based on GenericQueue by  Elvis Foster

// 

import javax.swing.JOptionPane; 
import java.util.LinkedList;

public class Queue  
{
   
    protected LinkedList GenQueue;
    protected int Length;
   
    
    public Queue() 
    { GenQueue = new LinkedList(); Length = 0;}

    
    

    public void addRear(Object thisObject)
    { GenQueue.addLast(thisObject); Length++; }
    
   
    public boolean contains(Object thisObject)
    { return GenQueue.contains(thisObject); }
    

    public int indexOf(Object thisObject)
    { return GenQueue.indexOf(thisObject); }
     
    
    public Object removeFront()
    {   Object Discard = null;
        if (!GenQueue.isEmpty()) {Discard = GenQueue.removeFirst(); Length--;} 
        return Discard;
    }
    
   
    public Object get(int Position)
    {
      
      int x = 1;
      Object[] ThisList = toArray();
      return ThisList[Position - 1];
    } 
    
   
     public Object getX(int Position)
    {  Object[] AuxList = new Object[Length];
       int y, PriorLength = Length;
       
      
       for (y = 1; y <= PriorLength; y++)
       { AuxList[y-1] = new Object(); AuxList[y-1] = removeFront();}
              
       
       for (y = 1; y <= PriorLength; y++) {addRear(AuxList[y-1]);}     
       return AuxList[Position - 1];
    } 
    
    
    public int size()
            
    { return Length; }
    
    
    public void clear()
    { GenQueue.clear(); Length = 0;}
    
   
    public Object[] toArray()
    {
       Object[] AuxList = new Object[Length];
       int y, PriorLength = Length;

      
       for (y = 1; y <= PriorLength; y++)
       { AuxList[y-1] = new Object(); AuxList[y-1] = removeFront();}
       
       
       for (y = 1; y <= PriorLength; y++) {addRear(AuxList[y-1]);}     
       return AuxList;
    }
        
    
    public boolean isEmpty()
    { return GenQueue.isEmpty(); }
    
   
    public Object getFront()
    { return GenQueue.getFirst(); }
    
    
    public Object getRear()
    { return GenQueue.getLast(); }
    
    
    public Object peekFront()
    { return GenQueue.getFirst(); }
    
    
    public Object peekRear()
    { return GenQueue.getLast(); }

    
    
} 
