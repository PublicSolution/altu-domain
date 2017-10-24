package org.psolution.altu.domain

import akka.actor.{FSM}
import akka.persistence.fsm.PersistentFSM.FSMState

trait Repository[+Entity] extends FSM[FSMState, DomainEvent]{
}
