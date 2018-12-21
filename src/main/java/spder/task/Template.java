package spder.task;

import us.codecraft.webmagic.Spider;

public abstract class Template implements Runnable {
    protected Task task;
    protected Spider spider;

    public Template(Task task) {
        this.task = task;
    }

    public Task getTask() {
        return task;
    }

    public void run() {
        spider.run();
    }
}
