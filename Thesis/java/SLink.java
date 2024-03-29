/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class SLink {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SLink(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SLink obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_SLink(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDest(SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t value) {
    daocJNI.SLink_dest_set(swigCPtr, this, SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t getDest() {
    long cPtr = daocJNI.SLink_dest_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t(cPtr, false);
  }

  public SLink(SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t ldest) {
    this(daocJNI.new_SLink(SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t.getCPtr(ldest)), true);
  }

  public final static boolean IS_WEIGHTED = daocJNI.SLink_IS_WEIGHTED_get();
  public final static float weight = daocJNI.SLink_weight_get();
}
