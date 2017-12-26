package era;

import java.util.Optional;

public class Fsm {

    Node root;

    Fsm add(State state, Action action) {
        Node next = new Node(state, action);
        if (this.root == null) {
            this.root = next;
        } else {
            this.root = new Node(next, root.state, root.action);
        }
        return this;
    }


    public void run() {

    }


    private class Node {

        final Node next;
        final State state;
        final Action action;

        Node(State state, Action action) {
            this(null, state, action);
        }

        Node(Node next, State state, Action action) {
            this.next = next;
            this.state = state;
            this.action = action;
        }

    }
}
