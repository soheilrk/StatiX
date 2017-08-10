/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class SCLink {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SCLink(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SCLink obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_SCLink(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setDest(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t value) {
    daocJNI.SCLink_dest_set(swigCPtr, this, SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t getDest() {
    long cPtr = daocJNI.SCLink_dest_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t(cPtr, false);
  }

  public void setWeight(double value) {
    daocJNI.SCLink_weight_set(swigCPtr, this, value);
  }

  public double getWeight() {
    return daocJNI.SCLink_weight_get(swigCPtr, this);
  }

  public SCLink(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t ldest, double lweight) {
    this(daocJNI.new_SCLink__SWIG_0(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t.getCPtr(ldest), lweight), true);
  }

  public SCLink(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t ldest) {
    this(daocJNI.new_SCLink__SWIG_1(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t.getCPtr(ldest)), true);
  }

}