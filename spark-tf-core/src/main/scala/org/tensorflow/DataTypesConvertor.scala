/**
 *  Copyright (c) 2016 Intel Corporation 
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.tensorflow

import scala.language.implicitConversions

/**
 * DataTypes supported
 */
object DataTypesConvertor {

  def toFloat(value: Any): Float = {
    value match {
      case null => throw new IllegalArgumentException("null cannot be converted to Float")
      case i: Int => i.toFloat
      case l: Long => l.toFloat
      case f: Float => f
      case d: Double => d.toFloat
      case bd: BigDecimal => bd.toFloat
      case s: String => s.trim().toFloat
      case _ => throw new RuntimeException(s"${value.getClass.getName} toFloat is not implemented")
    }
  }
}

