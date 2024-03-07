package com.directi.training.ocp.exercice_refactored;

public abstract class Resource{


	abstract void  markSlotFree(int resourceId);
    abstract void markSlotBusy(int resourceId);
    abstract int findFreeSlot();
    
}
