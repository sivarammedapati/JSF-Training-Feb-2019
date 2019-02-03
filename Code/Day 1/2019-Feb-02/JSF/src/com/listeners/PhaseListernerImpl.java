package com.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class PhaseListernerImpl implements PhaseListener{

	@Override
	public void afterPhase(PhaseEvent evt) {
		
		System.out.println("PhaseListernerImpl.afterPhase(): " + evt.getPhaseId());
	}

	@Override
	public void beforePhase(PhaseEvent evt) {
		
		System.out.println("PhaseListernerImpl.beforePhase(): " + evt.getPhaseId());
	}

	@Override
	public PhaseId getPhaseId() {
		
		return PhaseId.ANY_PHASE;
	}

}





