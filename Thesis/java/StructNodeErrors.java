/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class StructNodeErrors extends StructErrors {
  private transient long swigCPtr;

  protected StructNodeErrors(long cPtr, boolean cMemoryOwn) {
    super(daocJNI.StructNodeErrors_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(StructNodeErrors obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_StructNodeErrors(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setNids(SWIGTYPE_p_unsigned_int value) {
    daocJNI.StructNodeErrors_nids_set(swigCPtr, this, SWIGTYPE_p_unsigned_int.getCPtr(value));
  }

  public SWIGTYPE_p_unsigned_int getNids() {
    long cPtr = daocJNI.StructNodeErrors_nids_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_unsigned_int(cPtr, false);
  }

  public StructNodeErrors(String msg) {
    this(daocJNI.new_StructNodeErrors(msg), true);
  }

  public void add(long nid) {
    daocJNI.StructNodeErrors_add(swigCPtr, this, nid);
  }

}