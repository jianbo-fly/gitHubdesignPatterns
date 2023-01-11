package com.example.designpatterns.memento.pattern;

import lombok.Data;

/**
 * 用途:
 *
 * @author tangjianbo
 * @date 2023/01/09 11:21
 */
@Data
public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }
    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
