package com.hufudb.openhufu.mpc.bristol;

import static org.junit.Assert.assertEquals;
import com.google.common.collect.ImmutableList;
import com.hufudb.openhufu.mpc.bristol.BristolFile.Gate;
import org.junit.Test;

public class BristolFileTest {

  @Test
  public void testGate() {
    Gate gate1 = new Gate(0, 32, 33, GateType.AND);
    assertEquals(gate1.toString(), "2 1 0 32 33 AND");
    Gate gate2 = new Gate(0, 33, GateType.NOT);
    assertEquals(gate2.toString(), "1 1 0 33 INV");
  }

  @Test
  public void testCircuit() {
    try {
      BristolFile adder32 = CircuitType.ADD_32.getBristol();
      assertEquals(adder32.gateNum, 375);
      assertEquals(adder32.wireNum, 439);
      assertEquals(adder32.in1, 32);
      assertEquals(adder32.in2, 32);
      assertEquals(adder32.out, 33);
      int gateNum = 0;
      for (ImmutableList<Gate> gates: adder32.getGates()) {
        gateNum += gates.size();
      }
      assertEquals(adder32.gateNum, gateNum);
      BristolFile adder64 = CircuitType.ADD_64.getBristol();
      assertEquals(adder64.gateNum, 759);
      assertEquals(adder64.wireNum, 887);
      assertEquals(adder64.in1, 64);
      assertEquals(adder64.in2, 64);
      assertEquals(adder64.out, 65);
      gateNum = 0;
      for (ImmutableList<Gate> gates: adder64.getGates()) {
        gateNum += gates.size();
      }
      assertEquals(adder64.gateNum, gateNum);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
