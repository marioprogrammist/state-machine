package com.mario.statemachine;

import org.springframework.statemachine.listener.StateMachineListenerAdapter;
import org.springframework.statemachine.state.State;

import java.util.logging.Logger;

public class StateMachineListener extends StateMachineListenerAdapter {

    private static final Logger LOGGER = Logger.getLogger(StateMachineListener.class.getName());

    @Override
    public void stateChanged(State from, State to) {
        LOGGER.info(() -> String.format("lISTENER GLOBAL :: TRANSICIONAMOS from %s to %s%n", from == null ? "none" : from.getId(), to.getId()));
    }
}