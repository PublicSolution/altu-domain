package org.psolution.altu.domain

import akka.actor.ActorLogging
import akka.persistence.PersistentActor

trait DomainEntity extends PersistentActor with ActorLogging{

}
