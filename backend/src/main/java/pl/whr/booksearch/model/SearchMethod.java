package pl.whr.booksearch.model;

import org.codehaus.jackson.annotate.JsonValue;

public class SearchMethod implements Comparable<SearchMethod> {
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
        this.name = name;
    }
    public SearchMethod() {}

    public SearchMethod(Integer priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    Integer priority;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @Override
    public int compareTo(SearchMethod that) {
        return this.priority.compareTo(that.priority);
    }

    @Override
    public String toString() {
        return name;
    }
}
