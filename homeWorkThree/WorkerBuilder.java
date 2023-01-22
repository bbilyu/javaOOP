package homeWorkThree;


public class WorkerBuilder {
    Worker t;
    private static WorkerBuilder cb;
    public static WorkerBuilder Create() {
        if (cb == null)
            cb = new WorkerBuilder();
        cb.t = new Worker();
        return cb;
    }

    private WorkerBuilder() {
        t = new Worker();;
    }

    public WorkerBuilder setAge(int peopleAge) {
        t.setAge(peopleAge);
        return this;
    }

    public WorkerBuilder setSalary(int peopleSalary) {
        t.setSalary(peopleSalary);
        return this;
    }

    public WorkerBuilder setName(String peopleNamee) {
        t.setName(peopleNamee);
        return this;
    }
    public Worker build() {
        return t;
    }
}
