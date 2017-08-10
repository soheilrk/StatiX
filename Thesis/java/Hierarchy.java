/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class Hierarchy {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Hierarchy(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Hierarchy obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_Hierarchy(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Hierarchy assign(Hierarchy arg0) {
    return new Hierarchy(daocJNI.Hierarchy_assign(swigCPtr, this, Hierarchy.getCPtr(arg0), arg0), false);
  }

  public SWIGTYPE_p_daoc__NodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t nodes() {
    return new SWIGTYPE_p_daoc__NodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t(daocJNI.Hierarchy_nodes(swigCPtr, this), false);
  }

  public SWIGTYPE_p_daoc__LevelsT_std__vectorT_daoc__WeightedLinkT_float_t_t_t levels() {
    return new SWIGTYPE_p_daoc__LevelsT_std__vectorT_daoc__WeightedLinkT_float_t_t_t(daocJNI.Hierarchy_levels(swigCPtr, this), false);
  }

  public SWIGTYPE_p_daoc__ItemsT_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t_p_t root() {
    return new SWIGTYPE_p_daoc__ItemsT_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t_p_t(daocJNI.Hierarchy_root(swigCPtr, this), false);
  }

  public HierScore score() {
    return new HierScore(daocJNI.Hierarchy_score(swigCPtr, this), false);
  }

  public double weight() {
    return daocJNI.Hierarchy_weight(swigCPtr, this);
  }

  public boolean edges() {
    return daocJNI.Hierarchy_edges(swigCPtr, this);
  }

  public SWIGTYPE_p_daoc__ClusterNodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t unwrap(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t cl, boolean maxshare) {
    return new SWIGTYPE_p_daoc__ClusterNodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t(daocJNI.Hierarchy_unwrap__SWIG_0(swigCPtr, this, SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t.getCPtr(cl), maxshare), true);
  }

  public SWIGTYPE_p_daoc__ClusterNodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t unwrap(SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t cl) {
    return new SWIGTYPE_p_daoc__ClusterNodesT_std__vectorT_daoc__WeightedLinkT_float_t_t_t(daocJNI.Hierarchy_unwrap__SWIG_1(swigCPtr, this, SWIGTYPE_p_daoc__ClusterT_std__vectorT_daoc__WeightedLinkT_float_t_t_t.getCPtr(cl)), true);
  }

  public void output(OutputOptions opts) {
    daocJNI.Hierarchy_output(swigCPtr, this, OutputOptions.getCPtr(opts), opts);
  }

}