package org.psolution.altu.domain

import akka.actor.ActorLogging
import akka.persistence.PersistentActor

abstract class AggregateRoot extends PersistentActor with ActorLogging {

  def publish(event: Event): Unit = {
    self ! event
  }

  def consume(event: Event): Unit

  override def receiveRecover = ???

  override def receiveCommand = { case _=> consume(_) }
}
