/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class Level {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Level(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Level obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_Level(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setFullsize(long value) {
    daocJNI.Level_fullsize_set(swigCPtr, this, value);
  }

  public long getFullsize() {
    return daocJNI.Level_fullsize_get(swigCPtr, this);
  }

  public SWIGTYPE_p_daoc__ClustersT_std__vectorT_daoc__WeightedLinkT_float_t_t_t items() {
    return new SWIGTYPE_p_daoc__ClustersT_std__vectorT_daoc__WeightedLinkT_float_t_t_t(daocJNI.Level_items(swigCPtr, this), false);
  }

  public Level(long size) {
    this(daocJNI.new_Level__SWIG_0(size), true);
  }

  public Level(long size, SWIGTYPE_p_daoc__ClustersT_std__vectorT_daoc__WeightedLinkT_float_t_t_t cls) {
    this(daocJNI.new_Level__SWIG_1(size, SWIGTYPE_p_daoc__ClustersT_std__vectorT_daoc__WeightedLinkT_float_t_t_t.getCPtr(cls)), true);
  }

  public Level(Level arg0) {
    this(daocJNI.new_Level__SWIG_2(Level.getCPtr(arg0), arg0), true);
  }

  public Level assign(Level arg0) {
    return new Level(daocJNI.Level_assign(swigCPtr, this, Level.getCPtr(arg0), arg0), false);
  }

}
