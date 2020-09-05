package modelo.repository;

import modelo.workingzone.WorkingZone;
import modelo.archivo.Archivo;
import modelo.repozone.RepoZone;

public interface RepositoryInterface {
    String repoName = "";
    // working directory
    WorkingZone workingDirectory = new WorkingZone();
    WorkingZone indexZone = new WorkingZone();
    RepoZone LocalRepo = new RepoZone();
    RepoZone RemoteRepo = new RepoZone();

    void gitInit(String repoName);
    void gitAdd();
    void gitCommit(String message);
    void gitPush();
    void gitPull();
    void gitStatus();
    void addFileToworkingDirectory(Archivo file);
}