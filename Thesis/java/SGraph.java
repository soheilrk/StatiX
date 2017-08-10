/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class SGraph {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SGraph(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SGraph obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_SGraph(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SGraph(long nodesNum, boolean shuffle, boolean sumdups) {
    this(daocJNI.new_SGraph__SWIG_0(nodesNum, shuffle, sumdups), true);
  }

  public SGraph(long nodesNum) {
    this(daocJNI.new_SGraph__SWIG_1(nodesNum), true);
  }

  public SGraph() {
    this(daocJNI.new_SGraph__SWIG_2(), true);
  }

  public SGraph(SGraph arg0) {
    this(daocJNI.new_SGraph__SWIG_3(SGraph.getCPtr(arg0), arg0), true);
  }

  public SGraph assign(SGraph arg0) {
    return new SGraph(daocJNI.SGraph_assign(swigCPtr, this, SGraph.getCPtr(arg0), arg0), false);
  }

  public SWIGTYPE_p_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t nodes() {
    return new SWIGTYPE_p_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t(daocJNI.SGraph_nodes(swigCPtr, this), false);
  }

  public boolean directed() {
    return daocJNI.SGraph_directed(swigCPtr, this);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t release(SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t idnodes, SWIGTYPE_p_bool directed) {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t(daocJNI.SGraph_release__SWIG_0(swigCPtr, this, SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t.getCPtr(idnodes), SWIGTYPE_p_bool.getCPtr(directed)), true);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t release(SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t idnodes) {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t(daocJNI.SGraph_release__SWIG_1(swigCPtr, this, SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t.getCPtr(idnodes)), true);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t release() {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t_t(daocJNI.SGraph_release__SWIG_2(swigCPtr, this), true);
  }

  public SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t node(long id) {
    long cPtr = daocJNI.SGraph_node(swigCPtr, this, id);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_false_t_t_t(cPtr, false);
  }

  public void reset(long nodesNum, boolean shuffle, boolean sumdups) {
    daocJNI.SGraph_reset__SWIG_0(swigCPtr, this, nodesNum, shuffle, sumdups);
  }

  public void reset(long nodesNum, boolean shuffle) {
    daocJNI.SGraph_reset__SWIG_1(swigCPtr, this, nodesNum, shuffle);
  }

  public void reset(long nodesNum) {
    daocJNI.SGraph_reset__SWIG_2(swigCPtr, this, nodesNum);
  }

  public void reset() {
    daocJNI.SGraph_reset__SWIG_3(swigCPtr, this);
  }

  public void addNodes(long number, long id0, StructNodeErrors errs) {
    daocJNI.SGraph_addNodes__SWIG_0(swigCPtr, this, number, id0, StructNodeErrors.getCPtr(errs), errs);
  }

  public void addNodes(long number, long id0) {
    daocJNI.SGraph_addNodes__SWIG_1(swigCPtr, this, number, id0);
  }

  public void addNodes(long number) {
    daocJNI.SGraph_addNodes__SWIG_2(swigCPtr, this, number);
  }

  public void addNodes(SWIGTYPE_p_daoc__ItemsT_unsigned_int_t nodesIds, StructNodeErrors errs) {
    daocJNI.SGraph_addNodes__SWIG_3(swigCPtr, this, SWIGTYPE_p_daoc__ItemsT_unsigned_int_t.getCPtr(nodesIds), StructNodeErrors.getCPtr(errs), errs);
  }

  public void addNodes(SWIGTYPE_p_daoc__ItemsT_unsigned_int_t nodesIds) {
    daocJNI.SGraph_addNodes__SWIG_4(swigCPtr, this, SWIGTYPE_p_daoc__ItemsT_unsigned_int_t.getCPtr(nodesIds));
  }

  public void addNodeArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeArcs__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeArcs__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

  public void addNodeArcs(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeArcs__SWIG_2(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeArcs(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeArcs__SWIG_3(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

  public void addNodeEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeEdges__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeEdges__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

  public void addNodeEdges(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeEdges__SWIG_2(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeEdges(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeEdges__SWIG_3(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

  public void addNodeAndArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeAndArcs__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeAndArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeAndArcs__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

  public void addNodeAndEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links, StructLinkErrors lnerrs) {
    daocJNI.SGraph_addNodeAndEdges__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeAndEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t links) {
    daocJNI.SGraph_addNodeAndEdges__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_false_t_t.getCPtr(links));
  }

}