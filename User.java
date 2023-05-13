public class User implements Saveble, Reportable {
    private String name;
    private Persister persister = new Persister(this);
    private Reporter reporter = new Reporter(this);

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void save() {
        this.persister.save(this.toString());
    }
    @Override
    public void report() {
        reporter.report(this.toString());
    }
    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res
                .append("user ")
                .append(this.name)
                .append("\n");
        return res.toString();
    }
}