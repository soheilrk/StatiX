/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.0
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package info.exascale.daoc;

public class Graph {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Graph(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Graph obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        daocJNI.delete_Graph(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public Graph(long nodesNum, boolean shuffle, boolean sumdups) {
    this(daocJNI.new_Graph__SWIG_0(nodesNum, shuffle, sumdups), true);
  }

  public Graph(long nodesNum) {
    this(daocJNI.new_Graph__SWIG_1(nodesNum), true);
  }

  public Graph() {
    this(daocJNI.new_Graph__SWIG_2(), true);
  }

  public Graph(Graph arg0) {
    this(daocJNI.new_Graph__SWIG_3(Graph.getCPtr(arg0), arg0), true);
  }

  public Graph assign(Graph arg0) {
    return new Graph(daocJNI.Graph_assign(swigCPtr, this, Graph.getCPtr(arg0), arg0), false);
  }

  public SWIGTYPE_p_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t nodes() {
    return new SWIGTYPE_p_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t(daocJNI.Graph_nodes(swigCPtr, this), false);
  }

  public boolean directed() {
    return daocJNI.Graph_directed(swigCPtr, this);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t release(SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t idnodes, SWIGTYPE_p_bool directed) {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t(daocJNI.Graph_release__SWIG_0(swigCPtr, this, SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t.getCPtr(idnodes), SWIGTYPE_p_bool.getCPtr(directed)), true);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t release(SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t idnodes) {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t(daocJNI.Graph_release__SWIG_1(swigCPtr, this, SWIGTYPE_p_daoc__IdItemsT_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t.getCPtr(idnodes)), true);
  }

  public SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t release() {
    return new SWIGTYPE_p_shared_ptrT_daoc__NodesT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t_t(daocJNI.Graph_release__SWIG_2(swigCPtr, this), true);
  }

  public SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t node(long id) {
    long cPtr = daocJNI.Graph_node(swigCPtr, this, id);
    return (cPtr == 0) ? null : new SWIGTYPE_p_daoc__NodeT_daoc__LinksT_daoc__LinkT_daoc__LinkWeight_true_t_t_t(cPtr, false);
  }

  public void reset(long nodesNum, boolean shuffle, boolean sumdups) {
    daocJNI.Graph_reset__SWIG_0(swigCPtr, this, nodesNum, shuffle, sumdups);
  }

  public void reset(long nodesNum, boolean shuffle) {
    daocJNI.Graph_reset__SWIG_1(swigCPtr, this, nodesNum, shuffle);
  }

  public void reset(long nodesNum) {
    daocJNI.Graph_reset__SWIG_2(swigCPtr, this, nodesNum);
  }

  public void reset() {
    daocJNI.Graph_reset__SWIG_3(swigCPtr, this);
  }

  public void addNodes(long number, long id0, StructNodeErrors errs) {
    daocJNI.Graph_addNodes__SWIG_0(swigCPtr, this, number, id0, StructNodeErrors.getCPtr(errs), errs);
  }

  public void addNodes(long number, long id0) {
    daocJNI.Graph_addNodes__SWIG_1(swigCPtr, this, number, id0);
  }

  public void addNodes(long number) {
    daocJNI.Graph_addNodes__SWIG_2(swigCPtr, this, number);
  }

  public void addNodes(SWIGTYPE_p_daoc__ItemsT_unsigned_int_t nodesIds, StructNodeErrors errs) {
    daocJNI.Graph_addNodes__SWIG_3(swigCPtr, this, SWIGTYPE_p_daoc__ItemsT_unsigned_int_t.getCPtr(nodesIds), StructNodeErrors.getCPtr(errs), errs);
  }

  public void addNodes(SWIGTYPE_p_daoc__ItemsT_unsigned_int_t nodesIds) {
    daocJNI.Graph_addNodes__SWIG_4(swigCPtr, this, SWIGTYPE_p_daoc__ItemsT_unsigned_int_t.getCPtr(nodesIds));
  }

  public void addNodeArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeArcs__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeArcs__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

  public void addNodeArcs(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeArcs__SWIG_2(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeArcs(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeArcs__SWIG_3(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

  public void addNodeEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeEdges__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeEdges__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

  public void addNodeEdges(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeEdges__SWIG_2(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeEdges(long node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeEdges__SWIG_3(swigCPtr, this, node, SWIGTYPE_p_initializer_listT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

  public void addNodeAndArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeAndArcs__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeAndArcs(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeAndArcs__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

  public void addNodeAndEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links, StructLinkErrors lnerrs) {
    daocJNI.Graph_addNodeAndEdges__SWIG_0(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links), StructLinkErrors.getCPtr(lnerrs), lnerrs);
  }

  public void addNodeAndEdges(long node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t links) {
    daocJNI.Graph_addNodeAndEdges__SWIG_1(swigCPtr, this, node, SWIGTYPE_p_daoc__LinksT_daoc__InpLinkT_true_t_t.getCPtr(links));
  }

}
