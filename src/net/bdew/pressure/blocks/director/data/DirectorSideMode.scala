/*
 * Copyright (c) bdew, 2013 - 2015
 * https://github.com/bdew/pressure
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://bdew.net/minecraft-mod-public-license/
 */

package net.bdew.pressure.blocks.director.data

object DirectorSideMode extends Enumeration {
  val DISABLED = Value(0)
  val INPUT = Value(1)
  val OUTPUT_LOW = Value(2)
  val OUTPUT_MEDIUM = Value(3)
  val OUTPUT_HIGH = Value(4)

  val order = Map(
    DISABLED -> INPUT,
    INPUT -> OUTPUT_LOW,
    OUTPUT_LOW -> OUTPUT_MEDIUM,
    OUTPUT_MEDIUM -> OUTPUT_HIGH,
    OUTPUT_HIGH -> DISABLED
  )

  val outputs = Set(OUTPUT_LOW, OUTPUT_MEDIUM, OUTPUT_HIGH)
  val inputs = Set(INPUT)
}
