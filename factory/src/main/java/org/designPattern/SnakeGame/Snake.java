package org.designPattern.SnakeGame;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Snake {
    private Deque<Position> head ;
    private Map<Position, Boolean> bodySet;

    public Deque<Position> getHead() {
        return head;
    }

    public void setHead(Deque<Position> head) {
        this.head = head;
    }

    public Map<Position, Boolean> getBodySet() {
        return bodySet;
    }

    public void setBodySet(Map<Position, Boolean> bodySet) {
        this.bodySet = bodySet;
    }

    Snake() {
        this.head = new LinkedList<>();
        this.bodySet = new HashMap<>();
        Position initialPosition = new Position(0, 0);
        head.addFirst(initialPosition);
        bodySet.put(initialPosition, true);
    }
}
