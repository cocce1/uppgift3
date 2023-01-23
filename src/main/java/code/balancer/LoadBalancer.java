package code.balancer;



import code.Node;

import java.util.List;

public interface LoadBalancer {

    Node next(List<Node> nodes);
}
