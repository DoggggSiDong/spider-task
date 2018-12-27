package spder.task;

import us.codecraft.webmagic.Spider;

public abstract class Template implements Runnable {
    protected Task task;
    protected Spider spider;
    protected Account account;
    protected boolean ifNeedAcoount = true;
    public Template(Task task) {
        this.task = task;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public Account getAccount(){
        return account;
    }
    public Task getTask() {
        return task;
    }


    public boolean ifNeedAcoount(){
        return this.ifNeedAcoount;
    }

    public void run() {
        spider.run();
    }
}
