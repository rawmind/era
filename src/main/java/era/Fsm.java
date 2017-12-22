package era;

public class Fsm {


    Action initAction;

    public Fsm() {

        Action startCluster = new Action("Start node", "");
        initAction = startCluster;
        Action getGeo = new Action("Get geo info", "sync");
        Action checkIsNodeRun = new Action("Check node", "");
        Action runNode = new Action("Run node", "");
        Action joinCluster = new Action("Await", "");

        startCluster
                .bind(getGeo, new Success("config fetched"))
                .bind(checkIsNodeRun, new Success("node is not run"))
                .bind(runNode, new Success("node is running"))
                .bind(joinCluster, new Success("node is run"));


    }






}
