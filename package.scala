import com.thoughtworks.binding.Binding
import com.thoughtworks.binding.Binding.BindingSeq
import org.scalajs.dom.Node

import scala.xml.NodeBuffer

package object mypackage {
  implicit def makeIntellijHappy[T<:Any](x:T):Binding[T] = ???
  implicit def makeIntellijHappy[T<:org.scalajs.dom.raw.Node](x: scala.xml.Node): Binding[T] = ???
  implicit def makeIntellijHappy(x:NodeBuffer):Binding[BindingSeq[Node]] = ???
  implicit def makeIntellijHappy[I<:Elem,O<:HTMLElement](e:I):O = ???
}
