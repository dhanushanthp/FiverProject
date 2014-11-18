package se.cs.a4;


class EmptyContainerException extends Throwable {
    private String kind;

    public EmptyContainerException(String s) { this.kind = s; }
}