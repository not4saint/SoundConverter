package org.artem.projects.services;

public interface BytesFetcher {
    void start();
    void stop();
    boolean inProgress();
    byte[] getBytes();
    void drop();
}
