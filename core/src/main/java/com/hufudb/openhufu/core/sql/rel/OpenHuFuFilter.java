package com.hufudb.openhufu.core.sql.rel;

import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.core.sql.expression.CalciteConverter;
import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelOptCost;
import org.apache.calcite.plan.RelOptPlanner;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.core.Filter;
import org.apache.calcite.rel.metadata.RelMetadataQuery;
import org.apache.calcite.rex.RexNode;

public class OpenHuFuFilter extends Filter implements OpenHuFuRel {
  public OpenHuFuFilter(RelOptCluster cluster, RelTraitSet traitSet, RelNode child,
                        RexNode condition) {
    super(cluster, traitSet, child, condition);
  }

  @Override
  public RelOptCost computeSelfCost(RelOptPlanner planner, RelMetadataQuery mq) {
    return super.computeSelfCost(planner, mq).multiplyBy(0.05);
  }

  @Override
  public void implement(Implementor implementor) {
    implementor.visitChild((OpenHuFuRel) getInput());
    implementor.setFilterExps(CalciteConverter.convert(ImmutableList.of(condition), implementor.getCurrentOutput()));
  }

  @Override
  public Filter copy(RelTraitSet traitSet, RelNode input, RexNode condition) {
    return new OpenHuFuFilter(getCluster(), traitSet, input, condition);
  }
}
