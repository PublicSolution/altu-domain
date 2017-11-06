package org.psolution.altu.domain

trait Event {
   def callback(f: (AnyRef) => Unit): Unit = f.apply(AnyRef)
}
