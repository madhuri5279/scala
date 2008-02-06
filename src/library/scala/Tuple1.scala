
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2008, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Tue Feb 05 21:30:06 CET 2008

package scala

/** Tuple1 is the canonical representation of a @see Product1 */
case class Tuple1[+T1](_1:T1)
  extends Product1[T1]  {

   override def toString() = {
     val sb = new StringBuilder
     sb.append('(').append(_1).append(",)")
     sb.toString
   }
}
