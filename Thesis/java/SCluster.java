/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class SCluster {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SCluster(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SCluster obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_SCluster(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public long getId() {
    return daocJNI.SCluster_id_get(swigCPtr, this);
  }

  public SWIGTYPE_p_daoc__OwnersT_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t__NodeIT__links_type_t owncs() {
    return new SWIGTYPE_p_daoc__OwnersT_daoc__ClusterT_std__vectorT_daoc__SimpleLinkT_float_t_t_t__NodeIT__links_type_t(daocJNI.SCluster_owncs(swigCPtr, this), false);
  }

  public void setLinks(SWIGTYPE_p_daoc__LinksT_daoc__AccLinkT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_t value) {
    daocJNI.SCluster_links_set(swigCPtr, this, SWIGTYPE_p_daoc__LinksT_daoc__AccLinkT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_t.getCPtr(value));
  }

  public SWIGTYPE_p_daoc__LinksT_daoc__AccLinkT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_t getLinks() {
    long cPtr = daocJNI.SCluster_links_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__LinksT_daoc__AccLinkT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_t(cPtr, false);
  }

  public void setDes(SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t value) {
    daocJNI.SCluster_des_set(swigCPtr, this, SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t.getCPtr(value));
  }

  public SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t getDes() {
    long cPtr = daocJNI.SCluster_des_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t(cPtr, false);
  }

  public long getLevnum() {
    return daocJNI.SCluster_levnum_get(swigCPtr, this);
  }

  public SCluster(long lev, long cid, java.math.BigInteger linksNum) {
    this(daocJNI.new_SCluster__SWIG_0(lev, cid, linksNum), true);
  }

  public SCluster(long lev, java.math.BigInteger linksNum) {
    this(daocJNI.new_SCluster__SWIG_1(lev, linksNum), true);
  }

  public SCluster(long lev) {
    this(daocJNI.new_SCluster__SWIG_2(lev), true);
  }

  public SCluster(SCluster arg0) {
    this(daocJNI.new_SCluster__SWIG_3(SCluster.getCPtr(arg0), arg0), true);
  }

  public double weight() {
    return daocJNI.SCluster_weight(swigCPtr, this);
  }

  public void addWeight(double weight) {
    daocJNI.SCluster_addWeight(swigCPtr, this, weight);
  }

  public double ctxWeight() {
    return daocJNI.SCluster_ctxWeight(swigCPtr, this);
  }

  public SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t descs() {
    long cPtr = daocJNI.SCluster_descs(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__ItemsT_daoc__NodeIT_std__vectorT_daoc__SimpleLinkT_float_t_t_t_p_t(cPtr, false);
  }

  public void tidy() {
    daocJNI.SCluster_tidy(swigCPtr, this);
  }

}
